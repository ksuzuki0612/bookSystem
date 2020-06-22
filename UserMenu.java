import java.io.*;
import java.net.*;
import java.util.*;
import java.text.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;
import java.util.logging.Logger;


public class UserMenu extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException{

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    
    Logger logger = Logger.getLogger(UserMenu.class.getName());
    SqlMethod sql =new SqlMethod();
    List<Book> titleList = new ArrayList<>();
    
	}
    
    int errorNum = 0;
    
    public void searchBooks(int selected) {
        logger.entering(LogUtil.getClassName(), LogUtil.getMethodName());
        try{
            if(selected ==1){
                RequestDispatcher dispatcher = request.getRequestDispatcher
    	("/servlet/dispatch.searchTitle");
                dispatcher.forward(request,response);
            }
            else if(selected ==2){
                RequestDispatcher dispatcher = request.getRequestDispatcher
    	("/servlet/dispatch.searchAuthor");
    			dispatcher.forward(request,response);
            }
            else if(selected ==3){
                RequestDispatcher dispatcher = request.getRequestDispatcher
    	("/servlet/dispatch.searchField");
    			dispatcher.forward(request,response);
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
            int select = request.getParameter("select");
            if(select == 1){
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
    
    public void saveBooks(String saveFile,List<Book> titleList) {
        logger.entering(LogUtil.getClassName(), LogUtil.getMethodName());
        try{
            File csv = new File(saveFile);
            BufferedWriter bw = new BufferedWriter(new FileWriter(csv));
            for(Book t : titleList){
                bw.write(
                    "ISBN,"+t.getISBN()+
                    ",Title,"+ t.getTitle()+
                    ",Publisher,"+t.getPublisher()+
                    ",PublishDate,"+new SimpleDateFormat("yyyy/MM/dd").format(t.getPublishDate())+
                    ",Authors,"+ t.getStringAuthors()+
                    ",category, "+ t.getField()+
                    ",Inventory,"+ t.getInventory()+
                    ",BorrowedAmount," +t.getBorrowedAmount());
                bw.newLine();
            }
            bw.close();
        }catch(IOException e){
            errorNum = 1;    //日付の型が正しくありません
            e.printStackTrace();
            logger.severe("SEVERE");
        }
        finally{
            logger.exiting(LogUtil.getClassName(), LogUtil.getMethodName());
        }
    }
    
  
}
