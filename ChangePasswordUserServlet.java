import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("ResetPasswordServletUser")
public class ChangePasswordUserServlet extends HttpServlet{
    protected void doPost(final HttpServletRequest req,final HttpServletResponse res)
    throws ServletException,IOException{
        
        res.setContentType("text/html;charset=UTF8");
        PrintWriter out = res.getWriter();

        final ResetPassword pass = new ResetPassword();

        res.sendRedirect("passResetUserUI.jsp");
        String strID = req.getParameter("empID");
        int empID = Integer.parseInt(strID);
    
        String newPassword = req.getParameter("newPassword");
        String checkPassword = req.getParameter("checkPassword");
        boolean result = pass.checkResetPass(empID, newPassword, checkPassword);
    
        HttpSession session = req.getSession();
        session.setAttribute("result", result);
        res.sendRedirect("resultChangePassUser.jsp");
    }
}
