import java.io.*;
import javax.servlet.*;

public class AuthorCheckServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException{
        SqlMethod sql = new SqlMethod();

        String author = req.getParameter("searchauthor");
        
        boolean findauthor = sql.checkAuthor(author);

        if(findauthor == false){
            res.sendRedirect("noauthor.jsp");
        }else {
            sql.searchAuthor(author);
        }
       
    }
}