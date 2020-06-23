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
        PrintWriter out = res.getWriter();

        String isbn = req.getParameter("borrowISBN");
        
        boolean borrow = sql.borrowBookCheckk(isbn);

        if(borrow == false){
           out.println("貸し出したい書籍は全部貸出中です。");
        }else {
            res.sendRedirect("borrowbook.jsp");
        }
       
    }
}