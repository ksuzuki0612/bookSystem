import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.logging.Logger;
 
@WebServlet("/UpdateLendServlet")//[1]
public class UpdateLendServlet extends HttpServlet {//[2]
	Logger logger = Logger.getLogger(UpdateLendServlet.class.getName());
	SqlMethod sql =new SqlMethod();
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {//[3]
        	response.setContentType("text/html; charset=Shift_JIS");//[4]
            PrintWriter out = response.getWriter();
        	out.println("<!DOCTYPE html><html><head><meta charset='UTF-8' />");
            out.println("<title>ログイン</title>");
            out.println("</head><body>");//[4]
            String aISBN = request.getParameter("ISBN");
            String str= request.getParameter("addBorrowedAmount");
            int addBorrowedAmount = Integer.parseInt(str);
            sql.dbAddBorrowedAmount( aISBN,addBorrowedAmount);
            out.println("<a href=" + "updateBook.jsp" + ">更新メニューに戻る</a>");
            out.println("</body></html>");
    }
}

