import java.io.*;
import javax.servlet.*;

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