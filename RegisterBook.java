import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import javax.servlet.http.*;

 
@WebServlet("/RegisterBook")//[1]
public class RegisterBook extends HttpServlet {//[2]
//	Logger logger = Logger.getLogger(AdminMenu.class.getName());
	SqlMethod sql =new SqlMethod();
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {//[3]
        response.setContentType("text/html; charset=Shift_JIS");//[4]
        RequestDispatcher dispatcher = request.getRequestDispatcher("adminMenuUI");
		dispatcher.forward(request, response);
	}
        
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException,IOException {
		
	        request.setCharacterEncoding("UTF-8");
		String  isbnUi = request.getParameter("Isbn");//[5]
		String  titleUi = request.getParameter("title");
		String  publisherUi = request.getParameter("publisher");
		String  publishDate = request.getParameter("str4");
		String  fieldUi = request.getParameter("field");
		String  authorList = request.getParameter("author");
		String  str5 = request.getParameter("inventory");
                int inventoryUi = Integer.parseInt(str5);
        this.registerBook(isbnUi,titleUi, publisherUi,
            publishDate,fieldUi,authorList,inventoryUi);
   
//		RequestDispatcher dispatcher = request.getRequestDispatcher("adminMenuUI.jsp");
//		dispatcher.forward(request, response);
 
	}
        public void registerBook(String isbnUi,String titleUi,String publisherUi,
        String str4,String fieldUi,String author,int inventoryUi){
//        logger.entering(LogUtil.getClassName(), LogUtil.getMethodName());
        try{
            List<String> authorList = new ArrayList<String>();
    	    String publishDate = str4;
            authorList.add(author);
            int borrowedAmount = 0;
    
            sql.registerBook(isbnUi,titleUi,publisherUi, 
                publishDate,fieldUi,authorList,inventoryUi,borrowedAmount);
        }
        catch(Exception e){
    		e.printStackTrace();
        }
	 	finally{
//	 	    logger.exiting(LogUtil.getClassName(), LogUtil.getMethodName());
        }
    }
}


