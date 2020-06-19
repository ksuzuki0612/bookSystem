import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ResetPasswordServletUser extends HttpServlet{
    ResetPassword pass = new ResetPassword();
    
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException{
        
        int ans = req.getParameter("ans");

        if(ans == 1){
            res.sendRedirect("PassResultUI.jsp");
            String strID =req.getParameter("empID");
            int empID =Integer.parseInt(strID);

            String newPassword =req.getParameter("newPassword"); 
            String checkPassword =req.getParameter("checkPassword");
            boolean result = pass.checkResetPass(empID, newPassword, checkPassword);

            req.setAttribute("result",result);
            RequestDispatcher rd = req.getRequestDispatcher("/resultChangePassUser.jsp");
            rd.forward(req,res);
        }
        else{
            res.sendRedirect("choiceUserMenuUI.jsp");
        }
    }
}