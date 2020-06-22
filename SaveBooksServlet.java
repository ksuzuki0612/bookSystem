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

public class SaveBooksServlet extends HttpServlet{
    Logger logger = Logger.getLogger(SaveBooks.class.getName());
    List<Book> titleList = new ArrayList<>();
    final int errorNum = 0;
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException{
        logger.entering(LogUtil.getClassName(), LogUtil.getMethodName());
        String saveFile = request.getParameter("saveFileName");
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
