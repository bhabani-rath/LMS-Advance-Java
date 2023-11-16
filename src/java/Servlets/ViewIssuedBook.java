package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.BookDao;
import Beans.BookBean;
import Beans.IssueBookBean;

@WebServlet("/ViewIssuedBook")
public class ViewIssuedBook extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.println("<head>");
        out.println("<title>View Issued Book</title>");

        out.println("</head>");
        out.println("<body>");
        request.getRequestDispatcher("navlibrarian.html").include(request, response);

        out.println("<div>");
        out.println("<center>");
        out.println("<font color='white'>");
        out.println("<br><br><br><br><br><br><br><br><br><br><br>");

        List<IssueBookBean> list = BookDao.viewIssuedBooks();

        out.println("<table border='1'>");
        out.println("<tr><th>Callno</th><th>Student Id</th><th>Student Name</th><th>Student Mobile</th><th>Issued Date</th><th>Return Status</th></tr>");
        for (IssueBookBean bean : list) {
            out.println("<tr><td>" + bean.getCallno() + "</td><td>" + bean.getStudentid() + "</td><td>" + bean.getStudentname() + "</td><td>" + bean.getStudentmobile() + "</td><td>" + bean.getIssueddate() + "</td><td>" + bean.getReturnstatus() + "</td></tr>");
        }
        out.println("</table>");
        out.println("</font>");
        out.println("</center>");
        out.println("</div>");

        out.println("</body>");
        out.println("</html>");

        out.close();
    }
}
