import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckBorrowServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException,SQLException{
        SqlMethod sql = new SqlMethod();
        PrintWriter out = res.getWriter();

        String isbn = req.getParameter("borrowISBN");
        
        boolean borrow = sql.borrowBookCheck(isbn);

        if(borrow == false){
           out.println("貸し出したい書籍は全部貸出中です。");
           res.sendRedirect("choiceMenuAdmin.jsp");
        }else {
            res.sendRedirect("borrowbook.jsp");
        }
       
    }
}