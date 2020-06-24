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


public class CheckBorrowServlet extends HttpServlet{
    public void doPost(final HttpServletRequest req, final HttpServletResponse res)
            throws ServletException, IOException{

        res.setContentType("text/html;charset=UTF8");
     	PrintWriter out = res.getWriter();
     	
     	out.println("<!DOCTYPE html><html><head><meta charset='UTF-8' />");
        out.println("<title>書籍貸出チェック</title>");
        out.println("</head><body>");
     	
        SqlMethod sql = new SqlMethod();

        
        String ISBN = req.getParameter("borrowISBN");
        
        

        try{
            boolean register = sql.borrowBookCheck(ISBN);
            if (register == true){
                out.println("<a href=" + "borrowBook.jsp" + ">貸出の各項目を入力してください。</a>");
            } else {
                out.println("<a href=" + "adminMenuUI.jsp" + ">貸し出したい書籍は全部貸出中です。</a>");
            }
        }
        catch(Exception e){
            out.println("<a href=" + "adminMenuUI.jsp" + ">データベースに繋ぐことが出来ません。</a>");
            e.printStackTrace();
        }
       out.println("</body></html>");
    }
}
