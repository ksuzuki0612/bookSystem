import java.io.*;
import java.net.*;
import java.util.*;
import java.text.*;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchMenuServlet extends HttpServlet{
    Logger logger = Logger.getLogger(SearchMenuServlet.class.getName());
    List<Book> titleList = new ArrayList<>();
    int errorNum = 0;
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        SqlMethod sql = new SqlMethod();
        
        String selected = request.getParameter("MenuNum");
        
		int n = Integer.parseInt(selected); 
        try{
            if(n ==1){
            	response.sendRedirect("searchTitle.jsp");
            }
            else if(n ==2){
            	response.sendRedirect("searchAuthor.jsp");
            }
            else if(n ==3){
            	response.sendRedirect("searchCategory.jsp");
            }
            else{
                response.sendRedirect("userMenuUI.jsp");
            }
            
        }
        catch(Exception e){
            logger.severe("SEVERE");
        }
        finally{
            logger.exiting(LogUtil.getClassName(), LogUtil.getMethodName());
        }
    }
}
