import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MainMenuUser extends HttpServlet{

    public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        String choiceUser = request.getParameter("choiceUser");
        int choiceUserInt = Integer.parseInt(choiceUser);
        PrintWriter out = response.getWriter();
        switch (choiceUserInt) {
            case FeaturesMenu.UserMenu:
                response.sendRedirect("userMenuUI.jsp");
                break;
            case FeaturesMenu.AdminMenu:
                out.println("管理者権限がありません");
                break;
            case FeaturesMenu.ResetPass:
            	response.sendRedirect("resetPassUserUI.jsp");
                break;
            case FeaturesMenu.EndProgram:
                out.println("終了");
                break;
            default:
                out.println("<a href=" + "choiceMenuUser.jsp" + ">再度入力してください</a>");
                
        }
    }
    
}
