import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@Web
public class LoginServlet extends HttpServlet{
    protected void doPost(final HttpServletRequest req, final HttpServletResponse res)
            throws ServletException, IOException {
                
        final Login login = new Login();

        final String strID = req.getParameter("empID");
        int empID = Integer.parseInt(strID);
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