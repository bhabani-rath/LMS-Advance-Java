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

@WebServlet("/EditLibrarianForm")
public class EditLibrarianForm extends HttpServlet {

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
        out.println("<title>Edit Librarian Form</title>");

        out.println("</head>");
        out.println("<body>");

        request.getRequestDispatcher("navadmin.jsp").include(request, response);
        out.println("<div class='container'>");
        String sid = request.getParameter("id");
        int id = Integer.parseInt(sid);

        LibrarianBean bean = LibrarianDao.viewById(id);

        out.print("<form action='EditLibrarian' method='post'>");
        out.print("<div class='form-group'>");
        out.print("<input type='hidden' name='id' value='" + bean.getId() + "'/>");
        out.print("Name :");
        out.print("<input type='text' value='" + bean.getName() + "' name='name' placeholder='Name'>");
        out.print("</div>");
        out.print("<div class='form-group'>");
        out.print("Email address :");
        out.print("<input type='email' value='" + bean.getEmail() + "'  name='email' placeholder='Email'>");
        out.print("</div>");
        out.print("<div class='form-group'>");
        out.print("Password :");
        out.print("<input type='password' value='" + bean.getPassword() + "'  name='password'  placeholder='Password'>");
        out.print("</div> ");
        out.print("<div class='form-group'>");
        out.print("Mobile Number :");
        out.print("<input type='number' value='" + bean.getMobile() + "'  name='mobile' placeholder='Mobile'>");
        out.print("</div>");
        out.print("<button type='submit'>Update</button>");
        out.print("</form>");

        out.println("</div>");

        out.close();

    }
}
