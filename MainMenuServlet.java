import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MainMenuS extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        MainMenu mainMenu = new MainMenu();
        AdminMenu adminMenu = new AdminMenu();
        UserMenu userMenu = new UserMenu();
        int choiceAdmin = request.getParameter("choiceAdmin");
        PrintWriter out = response.getWriter();
        switch (choiceAdmin) {
            case FeaturesMenu.UserMenu:
                RequestDispatcher dispatch =
                request.getRequestDispatcher("userMenuUI.jsp");
                dispatch.forward(request, response);
                mainMenu.userMainMenu();
                break;
            case FeaturesMenu.AdminMenu:
                RequestDispatcher dispatch =
                request.getRequestDispatcher("adminMenuUI.jsp");
                dispatch.forward(request, response);
                mainMenu.adminMainMenu();
                break;
            case FeaturesMenu.ResetPass:
                RequestDispatcher dispatch =
                request.getRequestDispatcher("resetPassUI.jsp");
                dispatch.forward(request, response);
                boolean result = mainMenu.resetPassword();
                HttpSession session = request.getSession();
                session.setAttribute("result",result);
                break;
            case FeaturesMenu.EndProgram:
                out.println("終了");
                break loop;

            default:
                out.println("再度入力してください");
                continue;
            }
            
        int choiceUser = request.getParameter("choiceUser");
        switch (choiceUser) {
            case FeaturesMenu.UserMenu:
                RequestDispatcher dispatch =
                request.getRequestDispatcher("userMenuUI.jsp");
                dispatch.forward(request, response);
                mainMenu.userMainMenu();
                break;
            case FeaturesMenu.AdminMenu:
                out.println("管理者権限がありません");
                continue;
            case FeaturesMenu.ResetPass:
                RequestDispatcher dispatch =
                request.getRequestDispatcher("resetPassUI.jsp");
                dispatch.forward(request, response);
                boolean result = mainMenu.resetPassword();
                HttpSession session = request.getSession();
                session.setAttribute("result",result);
                break;
            case FeaturesMenu.EndProgram:
                out.println("終了");
                break loop;
            default:
                out.println("再度入力してください");
                continue;
        }


        

        int selectedAdmin = request.getParameter("selectedAdmin");
        int rb = request.getParameter("returnMainMenu");
        switch (selectedAdmin) {
            case AdminMenuNum.RegisterBook:
                adminMenu.registerBook();
                break;
            case AdminMenuNum.DeleteBook:
                adminMenu.deleteBook();
                break;
            case AdminMenuNum.ChangeBookInfo:
                adminMenu.updataBook();
                break;
            case AdminMenuNum.LoanAproval:
                adminMenu.allowBorrowBook();
                break;
            case AdminMenuNum.ReturnApplication:
                adminMenu.returnBook();
                break;
            case AdminMenuNum.ReturnProgram:
                out.println("6,戻る");
                break loop;
            default:
                out.println("再度入力してください");
                continue;
        }

        final int selectedUser = request.getParameter("selectedUser");
        HttpSession session = request.getSession();
        session.setAttribute("selectedUser",selectedUser);
        switch(selectedUser){
            case UserMenuNum.SearchBook:
                final int sb = request.getParameter("returnMainMenu");
                if (sb == 1) {
                break;
                }else {
                    RequestDispatcher dispatch =
                    request.getRequestDispatcher("userMenu.jsp");
                    dispatch.forward(request, response);
                    int str = request.getParameter("str");
                    userMenu.searchBooks(str);
                    break;
                }
            case UserMenuNum.CancelReservation:
                out.println("2，予約取消");
                break;
            case UserMenuNum.ReturnProgram:
                out.println("3,戻る");
                break;
            default:
                out.println("再度入力してください");
                continue; 
        }

        
    } 
}
    
    
