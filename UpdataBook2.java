import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.logging.Logger;
 
@WebServlet("/UpdataBook2")//[1]
public class UpdataBook2 extends HttpServlet {//[2]
	Logger logger = Logger.getLogger(UpdataBook2.class.getName());
	SqlMethod sql =new SqlMethod();
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {//[3]
        response.setContentType("text/html; charset=Shift_JIS");//[4]
        String aISBN = request.getParameter("ISBN");
        String str= request.getParameter("addBorrowedAmount");
        int addBorrowedAmount = Integer.parseInt(str);
        sql.dbAddBorrowedAmount( aISBN,addBorrowedAmount);

    }
}

