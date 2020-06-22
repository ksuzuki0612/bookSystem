import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

@webServlet("/MainMenuServlet")
public class MainMenuServlet extends HttpServlet{
    UserMenu userMenu = new UserMenu();
    RegisterBookServlet registerBookServlet = new RegisterBookServlet();
    DeleteBookServlet deleteBookServlet = new DeleteBookServlet();
    UpdataBook updataBook = new UpdataBook();
    BorrowBookServlet borrowBookServlet = new BorrowBookServlet();
    ReturnBook returnBook = new ReturnBook();

    public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        String choiceAdmin = request.getParameter("choiceAdmin");
        int choiceAdminInt = Integer.parseInt(choiceAdmin);

        PrintWriter out = response.getWriter();

        switch (choiceAdminInt) {
            case FeaturesMenu.UserMenu:
                response.sendRedirect("userMenuUI.jsp");
                userMainMenu(request,response);
                break;
            case FeaturesMenu.AdminMenu:
                response.sendRedirect("adminMenuUI.jsp");
                adminMainMenu(request,response);
                break;
            case FeaturesMenu.ResetPass:
                out.println("<a href=" + "resetPassUIAdmin.jsp" + ">パスワード再設定画面</a>");
                
                break;
            case FeaturesMenu.EndProgram:
                out.println("終了");
                break;

            default:
                out.println("再度入力してください");
            }
            
        String choiceUser = request.getParameter("choiceUser");
        int choiceUserInt = Integer.parseInt(choiceUser);
        switch (choiceUserInt) {
            case FeaturesMenu.UserMenu:
                response.sendRedirect("userMenuUI.jsp");
                userMainMenu(request,response);
                break;
            case FeaturesMenu.AdminMenu:
                out.println("管理者権限がありません");
                break;
            case FeaturesMenu.ResetPass:
               	out.println("<a href=" + "resetPassUIUser.jsp" + ">パスワード再設定画面</a>");
                break;
            case FeaturesMenu.EndProgram:
                out.println("終了");
                break;
            default:
                out.println("再度入力してください");
        }
    }

        
    public void adminMainMenu(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        String selectedAdmin = request.getParameter("selectedAdmin");
        int selectedAdminInt = Integer.parseInt(selectedAdmin);
        String rb = request.getParameter("returnMainMenu");
        PrintWriter out = response.getWriter();
        switch (selectedAdminInt) {
            case AdminMenuNum.RegisterBook:
                registerBookServlet.doPost();
                break;
            case AdminMenuNum.DeleteBook:
                deleteBookServlet.doPost(req,res);
                break;
            case AdminMenuNum.ChangeBookInfo:
                updataBook.doGet();
                break;
            case AdminMenuNum.LoanAproval:
                borrowBookServlet.doPost(req,res);
                break;
            case AdminMenuNum.ReturnApplication:
                returnBook.doGet(request,response);
                break;
            case AdminMenuNum.ReturnProgram:
                out.println("6,戻る");
                break;
            default:
                out.println("再度入力してください");
        }
    }

    public void userMainMenu(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        final String selectedUser = request.getParameter("selectedUser");
        HttpSession session = request.getSession();
        session.setAttribute("selectedUser",selectedUser);
        int selectedUserInt = Integer.parseInt(selectedUser);
        PrintWriter out = response.getWriter();
        switch(selectedUserInt){
            case UserMenuNum.SearchBook:
                final String sb = request.getParameter("returnMainMenu");
                int sbInt = Integer.parseInt(sb);
                if (sbInt == 1) {
                break;
                }else {
                    res.sendRedirect("userMenu.jsp");
                    String str = request.getParameter("str");
                    int strInt = Integer.parseInt(str);
                    userMenu.searchBooks(strInt);
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
        }   
    } 

}
    
    
