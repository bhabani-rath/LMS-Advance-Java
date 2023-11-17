package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.LibrarianDao;

@WebServlet("/LibrarianLogin")
public class LibrarianLogin extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.println("<head>");
        out.println("<title>Librarian Section</title>");

        out.println("</head>");
        out.println("<body>");

        String email = request.getParameter("email");
        String password = request.getParameter("password");
        if (LibrarianDao.authenticate(email, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("email", email);

            request.getRequestDispatcher("navlibrarian.jsp").include(request, response);

        } else {

            request.getRequestDispatcher("navhome.jsp").include(request, response);
            out.println("<div class='container'>");
            out.println("<font color='white'>");
            out.println("<br><br><br><br><br><br><br>");
            out.println("<center>");
            out.println("<h1>Username or password error</h1>");
            out.println("</center></font>");
            request.getRequestDispatcher("librarianloginform.jsp").include(request, response);

            out.println("</div>");

        }
        out.close();
    }

}
