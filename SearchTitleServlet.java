import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TitleCheckServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException,SQLException{
        SqlMethod sql = new SqlMethod();
        PrintWriter out = res.getWriter();

        String title = req.getParameter("searchtitle");
        
        boolean findtitle = sql.checkTitle(title);

        if(findtitle == false){
            out.println("探しているタイトルの書籍がありません。");
            res.sendRedirect("choiceMenuUser.jsp");
        }else {
            sql.searchTitle(title);
            res.sendRedirect("searchMenu.jsp");
        }
       
    }
}