import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MainMenuServlet extends HttpServlet{
    UserMenu userMenu = new UserMenu();
    RegisterBook registerBook = new RedisterBook();
    DeleteBookServlet deleteBookServlet = new DeleteBookServlet();
    UpdataBook updataBook = new UpdataBook();
    BorrowBookServlet borrowBookServlet = new BorrowBookServlet();
    ReturnBook returnBook = new ReturnBook();

    public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        int choiceAdmin = request.getParameter("choiceAdmin");

        PrintWriter out = response.getWriter();

        switch (choiceAdmin) {
            case FeaturesMenu.UserMenu:
                RequestDispatcher dispatch =
                request.getRequestDispatcher("userMenuUI.jsp");
                dispatch.forward(request, response);
                userMainMenu();
                break;
            case FeaturesMenu.AdminMenu:
                RequestDispatcher dispatch =
                request.getRequestDispatcher("adminMenuUI.jsp");
                dispatch.forward(request, response);
                adminMainMenu();
                break;
            case FeaturesMenu.ResetPass:
                RequestDispatcher dispatch =
                request.getRequestDispatcher("resetPassUIAdmin.jsp");
                dispatch.forward(request, response);
                break;
            case FeaturesMenu.EndProgram:
                out.println("終了");
                break;

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
                userMainMenu();
                break;
            case FeaturesMenu.AdminMenu:
                out.println("管理者権限がありません");
                continue;
            case FeaturesMenu.ResetPass:
                RequestDispatcher dispatch =
                request.getRequestDispatcher("resetPassUIUser.jsp");
                dispatch.forward(request, response);
                break;
            case FeaturesMenu.EndProgram:
                out.println("終了");
                break;
            default:
                out.println("再度入力してください");
                continue;
        }
    }

        
    public void adminMainMenu(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        int selectedAdmin = request.getParameter("selectedAdmin");
        int rb = request.getParameter("returnMainMenu");
        switch (selectedAdmin) {
            case AdminMenuNum.RegisterBook:
                registerBook.();
                break;
            case AdminMenuNum.DeleteBook:
                deleteBookServlet();
                break;
            case AdminMenuNum.ChangeBookInfo:
                updataBook.doGet();
                break;
            case AdminMenuNum.LoanAproval:
                borrowBookServlet();
                break;
            case AdminMenuNum.ReturnApplication:
                returnBook();
                break;
            case AdminMenuNum.ReturnProgram:
                out.println("6,戻る");
                break;
            default:
                out.println("再度入力してください");
                continue;
        }
    }

    public void userMainMenu(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
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
    
    
