import java.io.*;
import javax.servlet.*;

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