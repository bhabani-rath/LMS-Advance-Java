package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.LibrarianDao;
import Beans.LibrarianBean;

@WebServlet("/AddLibrarian")
public class AddLibrarian extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.println("<head>");
        out.println("<title>Add Librarian</title>");

        out.println("</head>");
        out.println("<body>");

        request.getRequestDispatcher("navadmin.jsp").include(request, response);
        out.println("<div>");

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String smobile = request.getParameter("mobile");
        long mobile = Long.parseLong(smobile);
        LibrarianBean bean = new LibrarianBean(name, email, password, mobile);
        LibrarianDao.save(bean);
        out.println("<font color='white'>");
        out.println("<br><br><br><br><br><br><br>");
        out.println("<center>");
        out.print("<h1>Librarian added successfully</h1>");
        out.println("</center>");
        out.println("</font>");
        request.getRequestDispatcher("addlibrarianform.jsp").include(request, response);
        out.println("</div>");

        out.close();
    }

}
