import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet{
    public void doPost(final HttpServletRequest req, final HttpServletResponse res)
            throws ServletException, IOException{

        res.setContentType("text/html;charset=UTF8");
     	PrintWriter out = res.getWriter();
     	
     	out.println("<!DOCTYPE html><html><head><meta charset='UTF-8' />");
        out.println("<title>ログイン</title>");
        out.println("</head><body>");
     	
        final Login login = new Login();

        
        final String strID = req.getParameter("empID");
        String password = req.getParameter("password");
        int intID = Integer.parseInt(strID);
        
        try{
            final int ID = login.loginCheck(intID, password);
            

            if (ID == 0) {
                //res.sendRedirect("wrongPass.jsp");
                out.println("<a href=" + "wrongPass.jsp" + ">パスワード/IDを再入力してください</a>");
            }

            final boolean adminRight = login.checkRight(ID);

            if(adminRight == true){
                //res.sendRedirect("choiceMenuAdmin.jsp"); 
                out.println("<a href= " + "choiceMenuAdmin.jsp" + ">メニュー画面へ</a>");
            }
            else{
               // res.sendRedirect("choiceMenuUser.jsp");
               out.println("<a href = " + "choiceMenuUser.jsp" + ">メニュー画面へ</a>");
            }
        }
        catch(Exception e){
            out.println("<a href=" + "wrongPass.jsp" + ">パスワード/IDを再入力してください</a>");
            e.printStackTrace();
            out.println(e);
        }
       out.println("</body></html>");
    }
}
