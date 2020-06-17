import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

//@WebServlet

public class LibraryMainservlet extends HttpServlet{
    static Login login = new Login();
    static MainMenu mainMenu = new MainMenu();
    public static int loginID = 0;//直す

    protected void doPost(HttpServletRequest req,HttpservletResponse res)
    throws ServletException,IOException{
        int checkEmpID = login.begin();//JSPからもらう
        loginID = checkEmpID;//dame 勝手にいじられないように変更の必要あり
        boolean checkRight = login.checkRight(checkEmpID);

        if (checkRight == true) {
            mainMenu.choiceMenuAdmin();//JSPで遷移
        } 
        else {
            mainMenu.choiceMenuUser(); //JSPで遷移
        }
    }
}