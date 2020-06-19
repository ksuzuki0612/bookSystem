import java.io.*;
import javax.servlet.*;

//@Web
public class LoginServlet extends HttpServlet{
    protected void doPost(final HttpServletRequest req, final HttpServletResponse res)
            throws ServletException, IOException {
                
        final Login login = new Login();

        final String strID = req.getParameter("empID");
        empID = Integer.parseInt(strID);
        final String password = req.getParmeter("password");

        final int ID = login.loginCheck(empID, password);

        if (ID == 0) {
            res.sendRedirect("wrongPass.jsp");
        }

        final boolean adminRight = login.checkRight(ID);

        if(adminRight == true){
            res.sendRedirect("choiceMenuAdmin.jsp"); 
        }
        else{
            res.sendRedirect("choiceMenuUser.jsp");
        }

    }
}