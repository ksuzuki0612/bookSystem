import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.logging.Logger;
 
//@WebServlet("/UpdateBookServlet")
public class UpdateBookServlet extends HttpServlet {
	Logger logger = Logger.getLogger(UpdateBookServlet.class.getName());
	SqlMethod sql =new SqlMethod();
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        	response.setContentType("text/html; charset=Shift_JIS");
            PrintWriter out = response.getWriter();
     	    out.println("<!DOCTYPE html><html><head><meta charset='UTF-8' />");
            out.println("<title>更新メニュー</title>");
            out.println("</head><body>");
            
            String str = request.getParameter("selectedUi");
            int selected = Integer.parseInt(str);
            if(selected == 1){
//                response.sendRedirect("updataBook1.jsp");
                  out.println("<a href=" + "updateInventory.jsp" + ">在庫変更へ進む</a>");
            }
            if(selected == 2){
//                response.sendRedirect("updataBook2.jsp");
                  out.println("<a href=" + "updateLend.jsp" + ">貸出本の更新へ進む</a>");
            }
            if(selected == 3){
//                response.sendRedirect("updataBook2.jsp");
                  out.println("<a href=" + "FunctionAdminServlet.java" + ">管理者メニューに戻る</a>");
            }
            else{
            	out.println("<a href=" + "updateBook.jsp" + ">再度入力してください</a>");
            }
            out.println("</body></html>");
    }
}
