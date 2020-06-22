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

public class SearchBooksServlet extends HttpServlet{
    Logger logger = Logger.getLogger(SearchBooksServlet.class.getName());
    List<Book> titleList = new ArrayList<>();
    final int errorNum = 0;
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        SqlMethod sql =new SqlMethod();
        try{
            if(selected ==1){
            	response.sendRedirect("userMenu.jsp");
            }
            else if(selected ==2){
            	//out.println
            }
            else if(selected ==3){
                //out.println
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
            int select = ui.saveApproval();
            if(select == 1){
                String saveFile =request.getParameter("saveFileName");
                this.saveBooks(saveFile,titleList);
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
