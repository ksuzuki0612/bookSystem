import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.logging.Logger;
 
@WebServlet("/UpdataBook")//[1]
public class UpdataBook extends HttpServlet {//[2]
	Logger logger = Logger.getLogger(UpdataBook.class.getName());
	SqlMethod sql =new SqlMethod();
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {//[3]
        response.setContentType("text/html; charset=Shift_JIS");//[4]
        String str = request.getParameter("selectedUi");
         int selected = Integer.parseInt(str);
        if(selected == 1){
            res.sendRedirect("updataBook1.jsp");
        }
        if(selected == 2){
            res.sendRedirect("updataBook2.jsp"); 
        }
        else{
        }

    }
}

      public int updataBook(int selected){
          logger.entering(LogUtil.getClassName(), LogUtil.getMethodName());
          loop:while (true){

		    switch(selected){
			    case 1:
                    String allowISBN = ui.isbnUi();
                    int addInventory = ui.addInventoryUi();
                    sql.dbUpdataInventory( allowISBN,addInventory );
                    break;
                case 2:
                    String aISBN = ui.isbnUi();
                    int addBorrowedAmount =ui.addBorrowedAmountUi();
                    sql.dbAddBorrowedAmount( aISBN,addBorrowedAmount);
                    break;
                case 3:
                    logger.exiting(LogUtil.getClassName(), LogUtil.getMethodName());
                    break loop;
                default:
//                    System.out.println("再度入力してください");
                    break;
            }
        }    
    }
