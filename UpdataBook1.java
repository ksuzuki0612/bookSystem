import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.logging.Logger;
 
@WebServlet("/UpdataBook1")//[1]
public class UpdataBook1 extends HttpServlet {//[2]
	Logger logger = Logger.getLogger(UpdataBook1.class.getName());
	SqlMethod sql =new SqlMethod();
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {//[3]
        response.setContentType("text/html; charset=Shift_JIS");//[4]
        String allowISBN = request.getParameter("ISBN");
        String str = request.getParameter("inventory");
        int addInventory = Integer.parseInt(str);
        sql.dbUpdataInventory( allowISBN,addInventory );

    }
}

