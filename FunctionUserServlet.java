import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FunctionUserServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        String selectedUser = request.getParameter("selectedUser");
        int selectedUserInt = Integer.parseInt(selectedUser);
        PrintWriter out = response.getWriter();
        switch(selectedUserInt){
            case UserMenuNum.SearchBook:
                response.sendRedirect("searchMenu.jsp");
                break;
            case UserMenuNum.CancelReservation:
                out.println("2，予約取消");
                break;
            case UserMenuNum.ReturnProgram:
                out.println("3,戻る");
                break;
            default:
                out.println("再度入力してください"); 
        }   
    } 

}