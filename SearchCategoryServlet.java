import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchCategoryServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException{
        SqlMethod sql = new SqlMethod();
        PrintWriter out = res.getWriter();

        String searchfield = req.getParameter("searchcategory");
        
        try{
            boolean findcategory = sql.checkField(searchfield);

            if(findcategory == false){
                out.println("探している分野の書籍がありません。");
                res.sendRedirect("choiceMenuUser.jsp");
            }else {
                sql.searchField(searchfield);
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