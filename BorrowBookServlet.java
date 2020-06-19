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

        String ISBN = req.getParameter("ISBN");
        String empID = req.getParameter("empID");
        String borrowFrom = req.getParameter("borrowFrom");
        String borrowTill = req.getParameter("borrowTill");
        
        boolean borrowBook = sql.borrowBook(ISBN, empID, borrowFrom, borrowTill);

        if(borrowBook == false){
            res.sendRedirect("employeecannotborrow.jsp");
        }else {
            res.sendRedirect("bookborrowed.jsp");
        }
       
    }
}