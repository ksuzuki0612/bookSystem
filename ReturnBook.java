import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.logging.Logger;
 
@WebServlet("/returnBook")//[1]
public class ReturnBook extends HttpServlet {//[2]
	Logger logger = Logger.getLogger(ReturnBook.class.getName());
	SqlMethod sql =new SqlMethod();
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {//[3]
        response.setContentType("text/html; charset=Shift_JIS");//[4]
        String str = request.getParameter("employeeUi");
        int employeeUi = Integer.parseInt(str);
        String isbnUi = request.getParameter("isbnUi");//[6]
        this.returnbooks(employeeUi,isbnUi);
    }

    private void returnbooks(int employeeUi, String isbnUi) {
        //    	logger.entering(LogUtil.getClassName(), LogUtil.getMethodName());
             sql.returnBook(isbnUi,employeeUi);
//        logger.exiting(LogUtil.getClassName(), LogUtil.getMethodName());
    }

}



