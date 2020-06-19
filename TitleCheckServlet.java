import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TitleCheckServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException{
        SqlMethod sql = new SqlMethod();

        String title = req.getParameter("searchtitle");
        
        boolean findtitle = sql.checkTitle(title);

        if(findtitle == false){
            res.sendRedirect("notitle.jsp");
        }else {
            sql.searchTitle(title);
        }
       
    }
}