import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BorrowBookServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException{
        SqlMethod sql = new SqlMethod();
        PrintWriter out = res.getWriter();

        String ISBN = req.getParameter("ISBN");
        String empID = req.getParameter("empID");
        int eid = Integer.parseInt(empID);
        String borrowFrom = req.getParameter("borrowFrom");
        String borrowTill = req.getParameter("borrowTill");
        
        boolean borrowBook = sql.borrowBook(ISBN, eid, borrowFrom, borrowTill);

        if(borrowBook == false){
            out.println("書籍はお一人10冊までです。");
            res.sendRedirect("choiceMenuAdmin.jsp");
        }else {
            out.println("書籍は貸し出されました。");
            res.sendRedirect("choiceMenuAdmin.jsp");
        }
       
    }
}