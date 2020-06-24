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


public class BorrowBookServlet extends HttpServlet{
    public void doPost(final HttpServletRequest req, final HttpServletResponse res)
            throws ServletException, IOException{

        res.setContentType("text/html;charset=UTF8");
     	PrintWriter out = res.getWriter();
     	
     	out.println("<!DOCTYPE html><html><head><meta charset='UTF-8' />");
        out.println("<title>貸出承認</title>");
        out.println("</head><body>");
     	
        SqlMethod sql = new SqlMethod();

        
        String ISBN = req.getParameter("lendISBN");
        String id = req.getParameter("borrowempID");
        int empID = Integer.parseInt(id);
        String borrowFrom = req.getParameter("borrowStart");
        String borrowTill = req.getParameter("borrowEnd");
        

        try{
            boolean register = sql.borrowBook(ISBN, empID, borrowFrom, borrowTill);
            if (register == true){
                out.println("<a href=" + "borrowBook.jsp" + ">貸出が承認されました。</a>");
            } else {
                out.println("<a href=" + "adminMenuUI.jsp" + ">従業員はお一人10冊までです。</a>");
            }
        }
        catch(Exception e){
            out.println("<a href=" + "adminMenuUI.jsp" + ">データベースに繋ぐことが出来ません。</a>");
            e.printStackTrace();
        }
       out.println("</body></html>");
    }
}
