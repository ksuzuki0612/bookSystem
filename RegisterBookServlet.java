import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterBookServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException,SQLException{
        SqlMethod sql = new SqlMethod();
        PrintWriter out = res.getWriter();

        String pubdate = req.getParameter("regPubdate");
        String authors = req.getParameter("regAuthor");
        String isbn = req.getParameter("regISBN");
        String title = req.getParameter("regTitle");
        String publisher = req.getParameter("regPublisher");
        String category = req.getParameter("regCategory");
        String inventory = req.getParameter("regInv");
        int inv = Integer.parseInt(inventory);
        int borrowedAmount = 0;
        
        try{
            boolean register = sql.registerBook(pubdate, authors, isbn, title, publisher, category, inv, borrowedAmount);

            if(register == true){
                out.println("書籍は登録されました。");
                res.sendRedirect("choiceMenuAdmin.jsp");
            }else {
                out.println("書籍は登録出来ませんでした。");
                res.sendRedirect("choiceMenuAdmin.jsp");
            }
        }
        catch(Exception e){
            out.println("SQLエラーです");
            res.sendRedirect("choiceMenuAdmin.jsp");
        }
       
    }
}