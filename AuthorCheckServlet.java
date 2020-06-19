import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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