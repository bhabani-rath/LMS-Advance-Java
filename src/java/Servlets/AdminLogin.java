package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {

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
        out.println("<title>Admin Section</title>");
        out.println("</head>");
        out.println("<body>");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        if (email.equals("bhabanishankarr21@gmail.com") && password.equals("bhabani$2004")) {
            HttpSession session = request.getSession();
            session.setAttribute("admin", "true");
            request.getRequestDispatcher("navadmin.jsp").include(request, response);
        } else {
            request.getRequestDispatcher("navhome.jsp").include(request, response);
            out.println("<div class='container'>");
            out.println("<center>");
            out.println("<font color='white'>");
            out.println("<br><br><br><br><br><br><br><br><br><br><br>");
            out.println("<h1>Username or password error</h1>");
            out.println("</font></center>");
            request.getRequestDispatcher("adminloginform.jsp").include(request, response);
            out.println("</div>");
        }
        out.close();
    }

}
