import java.io.*;
import javax.servlet.*;

//@Web
public class LoginServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException{
        Login login = new Login();

        int empID = req.getParameter("empID");
        String password = req.getParmeter("password");

        
    }
}