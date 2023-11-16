package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.LibrarianDao;
import Beans.LibrarianBean;

@WebServlet("/ViewLibrarian")
public class ViewLibrarian extends HttpServlet {

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
        out.println("<title>View Librarian</title>");

        out.println("</head>");
        out.println("<body>");

        request.getRequestDispatcher("navadmin.html").include(request, response);
        out.println("<div class='container'>");
        out.println("<center>");
        out.println("<font color='white'>");
        out.println("<br><br><br><br><br><br><br><br><br><br><br>");

        List<LibrarianBean> list = LibrarianDao.view();
        out.println("<font color='white'>");

        out.println("<table border='1'>");
        out.println("<tr><th>Id</th><th>Name</th><th>Email</th><th>Password</th><th>Mobile</th><th>Edit</th><th>Delete</th></tr>");
        for (LibrarianBean bean : list) {
            out.println("<tr><td>" + bean.getId() + "</td><td>" + bean.getName() + "</td><td>" + bean.getEmail() + "</td><td>" + bean.getPassword() + "</td><td>" + bean.getMobile() + "</td><td><a href='EditLibrarianForm?id=" + bean.getId() + "'>Edit</a></td><td><a href='DeleteLibrarian?id=" + bean.getId() + "'>Delete</a></td></tr>");
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
