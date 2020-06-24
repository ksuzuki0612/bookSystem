import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("ResetPasswordServletAdmin")
	
public class ResetPasswordAdminServlet extends HttpServlet{
    protected void doPost(final HttpServletRequest req, final HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html;charset=UTF8");
        PrintWriter out = res.getWriter();
        final ResetPassword pass = new ResetPassword();

        try{
            final String ansStr = req.getParameter("ans");
            final int ans = Integer.parseInt(ansStr);
    
            if (ans == 1) {
                res.sendRedirect("PassResetUI.jsp");
                final String strID = req.getParameter("empID");
                final int empID = Integer.parseInt(strID);
    
                final String newPassword = req.getParameter("newPassword");
                final String checkPassword = req.getParameter("checkPassword");
                final boolean result = pass.checkResetPass(empID, newPassword, checkPassword);
    
                HttpSession session = req.getSession();
                session.setAttribute("result", result);
                res.sendRedirect("resultChangePassAdmin.jsp");
            }
            else{
                out.println("<a href=" + "choiceMenuAdmin.jsp" + ">メニュー画面へ戻る</a>");
            }    
        }
        catch(Exception e){
            e.printStackTrace();
            out.println("<a href=" + "choiceMenuAdmin.jsp" + ">例外が発生しました。メニュー画面へ戻る</a>");
        }
    }
}
