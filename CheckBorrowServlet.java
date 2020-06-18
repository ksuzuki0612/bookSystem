import java.io.*;
import javax.servlet.*;

public class CheckBorrowServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException{
        SqlMethod sql = new SqlMethod();

        String isbn = req.getParameter("borrowISBN");
        
        boolean borrow = sql.borrowBookCheckk(isbn);

        if(delete == false){
            res.sendRedirect("nobooktoborrow.jsp");
        }else {
            res.sendRedirect("borrowbook.jsp");
        }
       
    }
}