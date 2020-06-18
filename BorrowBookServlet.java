import java.io.*;
import javax.servlet.*;

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