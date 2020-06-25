import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MainMenuAdmin extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        String choiceAdmin = request.getParameter("choiceAdmin");
        int choiceAdminInt = Integer.parseInt(choiceAdmin);

        PrintWriter out = response.getWriter();

        switch (choiceAdminInt) {
            case FeaturesMenu.UserMenu:
                response.sendRedirect("userMenuUI.jsp");
                break;
            case FeaturesMenu.AdminMenu:
                response.sendRedirect("adminMenuUI.jsp");
                break;
            case FeaturesMenu.ResetPass:
            	response.sendRedirect("resetPassAdminUI.jsp");
                break;
            case FeaturesMenu.EndProgram:
                out.println("終了");
                break;
            default:
                out.println("<a href=" + "choiceMenuAdmin.jsp" + ">再度入力してください</a>");
        }
    }

}
        
