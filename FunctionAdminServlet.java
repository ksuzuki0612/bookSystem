import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FunctionAdminServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        response.setContentType("text/html; charset=UTF-8");
        String selectedAdmin = request.getParameter("selectedAdmin");
        int selectedAdminInt = Integer.parseInt(selectedAdmin);
        PrintWriter out = response.getWriter();
        switch (selectedAdminInt) {
            case AdminMenuNum.RegisterBook:
                response.sendRedirect("registerBook.jsp");
                break;
            case AdminMenuNum.DeleteBook:
                response.sendRedirect("deleteBook.jsp");
                break;
            case AdminMenuNum.ChangeBookInfo:
                response.sendRedirect("updateBook.jsp");
                break;
            case AdminMenuNum.LoanAproval:
                response.sendRedirect("borrowIsbn.jsp");
                break;
            case AdminMenuNum.ReturnApplication:
                response.sendRedirect("returnBook.jsp");
                break;
            case AdminMenuNum.ReturnProgram:
                response.sendRedirect("choiceMenuAdmin.jsp");
                break;
            default:
                out.println("<a href=" + "adminMenuUI.jsp" + ">再度入力してください</a>");
        }
    }

}