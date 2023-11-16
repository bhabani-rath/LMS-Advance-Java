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
import Dao.LibrarianDao;
import Beans.BookBean;
import Beans.LibrarianBean;

@WebServlet("/ViewBook")
public class ViewBook extends HttpServlet {

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
        out.println("<title>View Book</title>");

        out.println("</head>");
        out.println("<body>");
        request.getRequestDispatcher("navlibrarian.html").include(request, response);
        out.println("<div>");
        out.println("<center>");
        out.println("<font color='white'>");
        out.println("<br>");
        out.println("<br><br><br><br><br><br><br><br><br><br><br>");

        List<BookBean> list = BookDao.view();
        out.println("<table border='1'>");
        out.println("<tr><th>Callno</th><th>Name</th><th>Author</th><th>Publisher</th><th>Quantity</th><th>Issued</th><th>Delete</th></tr>");
        for (BookBean bean : list) {
            out.println("<tr><td>" + bean.getCallno() + "</td><td>" + bean.getName() + "</td><td>" + bean.getAuthor() + "</td><td>" + bean.getPublisher() + "</td><td>" + bean.getQuantity() + "</td><td>" + bean.getIssued() + "</td><td><a href='DeleteBook?idno=" + bean.getCallno() + "'>Delete</a></td></tr>");
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
