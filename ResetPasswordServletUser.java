import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ResetPasswordServletUser extends HttpServlet{
    
    protected void doPost(final HttpServletRequest req,final HttpServletResponse res)
    throws ServletException,IOException{
        final ResetPassword pass = new ResetPassword();

        final String ansStr = req.getParameter("ans");
        final int ans = Integer.parseInt(ansStr);

        if (ans == 1) {
            res.sendRedirect("PassResultUI.jsp");
            final String strID = req.getParameter("empID");
            final int empID = Integer.parseInt(strID);

            final String newPassword = req.getParameter("newPassword");
            final String checkPassword = req.getParameter("checkPassword");
            final boolean result = pass.checkResetPass(empID, newPassword, checkPassword);

            req.setAttribute("result", result);
            final RequestDispatcher rd = req.getRequestDispatcher("/resultChangePassUser.jsp");
            rd.forward(req,res);
        }
        else{
            res.sendRedirect("choiceUserMenuUI.jsp");
        }
    }
}