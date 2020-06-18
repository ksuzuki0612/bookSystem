import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ResetPasswordServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException{
        ResetPassword pass = new ResetPassword();

        int ans = req.getParameter("ans");

        if(ans == 1){
            res.sendRedirect("PassResultUI.jsp");
            String strID =req.getParameter("empID");
            empID =Integer.parseInt(strID);

            String newPassword =req.getParameter("newPassword"); 
            String checkPassword =req.getParameter("checkPassword");

            boolean result = pass.checkResetPass(empID, newPassword, checkPassword);

            HttpSession session = request.getSession();
            session.setAttribute("result",result);

        }
        else{
            res.sendRedirect("choiceAdminMenuUI.jsp");
        }



    }
}