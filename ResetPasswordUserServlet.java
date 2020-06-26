import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("ResetPasswordServletUser")
public class ResetPasswordUserServlet extends HttpServlet{
    protected void doPost(final HttpServletRequest req,final HttpServletResponse res)
    throws ServletException,IOException{
        
        res.setContentType("text/html;charset=UTF8");
        PrintWriter out = res.getWriter();

        final ResetPassword pass = new ResetPassword();

        final String ansStr = req.getParameter("ans");
        final int ans = Integer.parseInt(ansStr);

        try{
            if (ans == 1) {
                res.sendRedirect("passResetUserUI.jsp");
            }
            else{
            	res.sendRedirect("choiceMenuUser.jsp");
        	}
        }
        catch(Exception e){
            e.printStackTrace();
            out.println("<a href=" + "choiceMenuUser.jsp" + ">例外が発生しました。メニュー画面へ戻る</a>");
            out.println(e);
        }
    }
}
