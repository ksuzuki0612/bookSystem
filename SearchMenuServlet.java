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
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        SqlMethod sql = new SqlMethod();
	int n = Integer.parseInt(selected); 
        try{
            if(n ==1){
            	RequestDispatcher dispatch = request.getRequestDispatcher("SearchTitle.jsp");
		        dispatch.forward(request, response);
            }
            else if(n ==2){
            	RequestDispatcher dispatch = request.getRequestDispatcher("SearchAuthor.jsp");
		        dispatch.forward(request, response);
            }
            else if(n ==3){
                RequestDispatcher dispatch = request.getRequestDispatcher("SearchCategory.jsp");
		        dispatch.forward(request, response);
            }
            else{
                return;
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
