import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SearchCategoryServlet extends HttpServlet{
    public void doPost(final HttpServletRequest req, final HttpServletResponse res)
            throws ServletException, IOException{

        res.setContentType("text/html;charset=UTF8");
     	PrintWriter out = res.getWriter();
     	
     	out.println("<!DOCTYPE html><html><head><meta charset='UTF-8' />");
        out.println("<title>書籍タイトル検索</title>");
        out.println("</head><body>");
     	
        SqlMethod sql = new SqlMethod();

        
        String category = req.getParameter("searchcategory");
        

        try{
             List<Book> book = sql.searchField(category);
            if (book.isEmpty()){
                out.println("<a href=" + "SearchMenuServlet" + ">探している分野の書籍がありません。</a>");
            } else {
                HttpSession session = req.getSession();
                session.setAttribute("book", book);
                //res.sendRedirect("resultChangePassAdmin.jsp");
                out.println("<a href=" + "ShowResultServlet" + "></a>");
            }
        }
        catch(Exception e){
            out.println("<a href=" + "adminMenuUI.jsp" + ">データベースに繋ぐことが出来ません。</a>");
        }
       out.println("</body></html>");
    }
}
