import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchAuthorServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException{
        SqlMethod sql = new SqlMethod();
        PrintWriter out = res.getWriter();

        String author = req.getParameter("searchAuthor");
        
        try{
            boolean delete = sql.deleteBook(author);

            if(delete == false){
                out.println("探している著者の書籍がありません。");
                res.sendRedirect("choiceMenuUser.jsp");
            }else {
                sql.searchAuthor(author);
                res.sendRedirect("searchMenu.jsp");
            }    
        }
        catch(Exception e){
            out.println("SQLエラーです");
            e.printStackTrace();
            res.sendRedirect("choiceMenuUser.jsp");
        }
       
    }
}