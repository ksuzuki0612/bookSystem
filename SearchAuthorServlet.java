import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchAuthorServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException{
        SqlMethod sql = new SqlMethod();

        String author = req.getParameter("searchAuthor");
        
        boolean delete = sql.deleteBook(author);

        if(delete == false){
            res.sendRedirect("noauthor.jsp");
        }else {
            sql.searchAuthor(author);
        }
       
    }
}