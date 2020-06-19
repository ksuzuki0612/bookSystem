import java.io.*;
import javax.servlet.*;

public class SearchAuthorServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException{
        SqlMethod sql = new SqlMethod();

        String author = req.getParameter("searchAuthor");
        
        boolean delete = sql.deleteBook(isbn);

        if(delete == false){
            res.sendRedirect("nobook.jsp");
        }else {
            res.sendRedirect("bookdeleted.jsp");
        }
       
    }
}