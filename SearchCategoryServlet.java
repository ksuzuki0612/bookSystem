import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CategoryCheckServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException{
        SqlMethod sql = new SqlMethod();

        String searchfield = req.getParameter("searchcategory");
        
        boolean findcategory = sql.checkField(searchfield);

        if(findcategory == false){
            res.sendRedirect("nofield.jsp");
        }else {
            sql.searchField(searchfield);
        }
       
    }
}