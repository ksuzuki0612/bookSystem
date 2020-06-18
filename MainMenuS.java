import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MainMenuS extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
		choiceMenuAdmin(request,response);
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		choiceMenuAdmin(request,response);
    }
    
    public void choiceMenuAdmin(
        HttpServletRequest request,
        HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html; charset=UTF-8");
        try {
            loop: while (true) {
                int choice = request.getParameter("choice");
                PrintWriter out = response.getWriter();
                switch (choice) {
                    case FeaturesMenu.UserMenu:
                        userMainMenu();
                        break;
                    case FeaturesMenu.AdminMenu:
                        adminMainMenu();
                        break;
                    case FeaturesMenu.ResetPass:
                        boolean result = resetPassword();
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
            }
        }
    }
    
    public void choiceMenuUser(){
        try {
            loop: while (true) {
                int choice = request.getParameter("choice");
                PrintWriter out = response.getWriter();
                switch (choice) {
                    case FeaturesMenu.UserMenu:
                        userMainMenu();
                        break;
                    case FeaturesMenu.AdminMenu:
                        out.println("管理者権限がありません");
                        continue;
                    case FeaturesMenu.ResetPass:
                        boolean result = resetPassword();
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
            }
        }
    }

    public boolean resetPassword(){
        PrintWriter out = response.getWriter();
        out.println("パスワード再設定画面");
        final int ans = request.getParameter("ans");
        if(ans == 1){
            final int empID = request.getParameter("empID");
            boolean idCheck = checkLoginID(empID);
            if(idCheck == true){
                final String password = request.getParameter("newPassword");
                final String checkPassword = request.getParameter("checkPassword");
                final boolean checkResult = checkResetPass(
                    empID, password, checkPassword);
                return checkResult;
            }else{
                out.println("ログインされたIDと入力されたIDが異なります");
                return false;
            }
        }else{
            boolean checkResult = false;
            return checkResult;
        } 
    }

    static AdminMenu adminMenu = new AdminMenu();
    static UserMenu userMenu = new UserMenu();
    SqlMethod sqlmethod = new SqlMethod();

    public boolean checkResetPass(
        final int ID,final String pass,final String checkPass){
        int empID = ID;
        String password = pass;
        String checkPassword = checkPass;
        if(password.equals(checkPassword)){
            sqlmethod.dbUpdatePassword(empID, password);
            return true;
        }else{
            return false;
        }
    }

    public boolean checkLoginID(int ID){
        int id = ID;
        int checkID = LibraryMain.loginID;
        if(id == checkID){
            return true;
        }else{
            return false;
        }
    }

    public static void adminMainMenu(){
        try {
            loop: while (true) {
                int selected = request.getParameter("selected");
                int rb = request.getParameter("");
                PrintWeiter out = response.getWriter();
                switch (selected) {
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
            }
        }
    }

    public static void userMainMenu(){
        try {
            loop: while (true) {
                final int selected = request.getParameter("selected");
                HttpSession session = request.getSession();
                session.setAttribute("selected",selected);
                PrintWriter out = response.getWriter();
                switch(selected){
                    case UserMenuNum.SearchBook:
                        final int sb = request.getParameter("");
                        if (sb == 1) {
                        break;
                        }else {
                            RequestDispatcher dispatch =
                            request.getRequestDispatcher("userMenu.jsp");
		                    dispatch.forward(request, response);
                            menuUI.userMenu();
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
    }
    
}