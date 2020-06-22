import java.io.*;
import java.net.*;
import java.util.*;
import java.text.*;
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
        try{
            if(selected ==1){
            	RequestDispatcher dispatch = request.getRequestDispatcher("SearchTitle.jsp");
		        dispatch.forward(request, response);
            }
            else if(selected ==2){
            	RequestDispatcher dispatch = request.getRequestDispatcher("SearchAuthor.jsp");
		        dispatch.forward(request, response);
            }
            else if(selected ==3){
                RequestDispatcher dispatch = request.getRequestDispatcher("SearchCategory.jsp");
		        dispatch.forward(request, response);
            }
            else{
                return;
            }
            System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s",
            "ISBN","Title","Publisher","Publishdate","Author","category","Inventory","Lent out"));
            for(Book t : titleList){
                System.out.println(  String.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s",
                    t.getISBN() ,t.getTitle() , t.getPublisher() ,
                    new SimpleDateFormat("yyyy/MM/dd").format(t.getPublishDate()),
                    t.getStringAuthors() , t.getField() , t.getInventory(),
                    t.getBorrowedAmount() ));
            }

            int select = request.getParameter("s1");
            
            if(select == 1){
                String saveFile =request.getParameter("saveFileName");
                this.saveBooks(saveFile,titleList);
                RequestDispatcher dispatch = request.getRequestDispatcher("SaveApproval.jsp");
		        dispatch.forward(request, response);
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
