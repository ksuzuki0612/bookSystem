import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteBookServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException{
        SqlMethod sql = new SqlMethod();
        PrintWriter out = res.getWriter();

        String isbn = req.getParameter("deleteISBN");
        
        boolean delete = sql.deleteBook(isbn);

        if(delete == false){
            out.println("書籍を削除できませんでした。");
        }else {
            out.println("書籍は削除されました。");
        }
       
    }
}