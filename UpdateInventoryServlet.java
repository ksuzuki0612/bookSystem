import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.logging.Logger;
 
//@WebServlet("/UpdateInventoryServlet")//[1]
public class UpdateInventoryServlet extends HttpServlet {//[2]
	Logger logger = Logger.getLogger(UpdateInventoryServlet.class.getName());
	SqlMethod sql =new SqlMethod();
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {//[3]
        	response.setContentType("text/html; charset=Shift_JIS");//[4]
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html><html><head><meta charset='UTF-8' />");
            out.println("<title>在庫変更</title>");
            out.println("</head><body>");
            String allowISBN = request.getParameter("ISBN");
            String str = request.getParameter("inventory");
            int addInventory = Integer.parseInt(str);
            sql.dbUpdataInventory( allowISBN,addInventory );
            out.println("<a href=" + "UpdataBook.jsp" + ">更新メニューに戻る</a>");
            out.println("</body></html>");
    }
}

