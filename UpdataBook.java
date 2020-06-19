import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.logging.Logger;
 
@WebServlet("/returnBook")//[1]
public class ReturnBook extends HttpServlet {//[2]
	Logger logger = Logger.getLogger(AdminMenu.class.getName());
	SqlMethod sql =new SqlMethod();
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {//[3]
        response.setContentType("text/html; charset=Shift_JIS");//[4]
        int selected = request.getParameter("selectedUi");//[5]
        PrintWriter out = response.getWriter();//[7]
        out.println("<html><head></head><body>");//[8]
        out.println("<form action="MainMenuS" method="POST">")
        <input name="selectedUi" type="text">
        <input type="submit">
         </form>
        out.println("</body></html>");//[12]
    }
     
        this.returnbook(employeeUi,isbnUi);
    }
}


      public void updataBook(){
          logger.entering(LogUtil.getClassName(), LogUtil.getMethodName());
          loop:while (true){
			int selected = ui.selectedUi();
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
                    System.out.println("再度入力してください");
                    break;
            }
        }    
    }
