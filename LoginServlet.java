import java.io.*;
import javax.servlet.*;

//@Web
public class LoginServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException{
        Login login = new Login();

        int empID = req.getParameter("empID");
        String password = req.getParmeter("password");

        int ID = login.loginCheck(empID,password);

        if(ID == 0){
            res.sendRedirect("wrongPass.jsp");
        }

        boolean adminRight = login.checkRight(ID);

        if(adminRight == true){
            res.sendRedirect("choiceMenuAdmin.jsp"); 
        }
        else{
            res.sendRedirect("choiceMenuUser.jsp");
        }

        
    }
}