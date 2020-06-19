import java.io.*;
import javax.servlet.*;

public class RegisterBookServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException{
        SqlMethod sql = new SqlMethod();

        String pubdate = req.getParameter("regPubdate");
        String authors = req.getParameter("regAuthor");
        String isbn = req.getParameter("regISBN");
        String title = req.getParameter("regTitle");
        String publisher = req.getParameter("regPublisher");
        String category = req.getParameter("regCategory");
        int inventory = req.getParameter("regInv");
        int borrowedAmount = 0;
        
        boolean register = sql.registerBook(pubdate, authors, isbn, title, publisher, category, inventory, borrowedAmount);

        if(register == true){
            res.sendRedirect("bookregistered.jsp");
        }else {
            res.sendRedirect("nobookregistered".jsp");
        }
       
    }
}