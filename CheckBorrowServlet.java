import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckBorrowServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException{
        SqlMethod sql = new SqlMethod();

        String isbn = req.getParameter("borrowISBN");
        
        boolean borrow = sql.borrowBookCheckk(isbn);

        if(borrow == false){
            res.sendRedirect("nobooktoborrow.jsp");
        }else {
            res.sendRedirect("borrowbook.jsp");
        }
       
    }
}