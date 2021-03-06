import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.logging.Logger;
 
//@WebServlet("/ReturnBookServlet")
public class ReturnBookServlet extends HttpServlet {
	Logger logger = Logger.getLogger(ReturnBookServlet.class.getName());
	SqlMethod sql =new SqlMethod();
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            response.setContentType("text/html; charset=Shift_JIS");
            PrintWriter out = response.getWriter();
     	    out.println("<!DOCTYPE html><html><head><meta charset='UTF-8' />");
            out.println("<title>更新メニュー</title>");
            out.println("</head><body>");
            String str = request.getParameter("employeeUi");
            String isbnUi = request.getParameter("isbnUi");
            boolean employeeUiCheck = checkNull(str);
            boolean isbnUiCheck =  checkNull(isbnUi);
            if(employeeUiCheck && isbnUiCheck){
                int employeeUi = Integer.parseInt(str);
                int a = sql.returnBook(isbnUi,employeeUi);
                if(a==0){
            	    out.println("書籍の貸出は削除されました。");
                }
                if(a==3){
            	    out.println("エラーが発生しました。");
                }   
            }
            else{
                out.println("初めからやり直してください。");
            }
	        out.println("<a href=" + "adminMenuUI.jsp" + ">更新メニューに戻る</a>");
            out.println("</body></html>");
    }
    private boolean checkNull(String name) {
        if(name.isEmpty()){
            return false;
        }
        return true;
    }
}





