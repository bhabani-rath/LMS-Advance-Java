package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.BookDao;
import Beans.BookBean;
import Beans.IssueBookBean;

@WebServlet("/IssueBook")
public class IssueBook extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.println("<head>");
        out.println("<title>Add Book Form</title>");

        out.println("</head>");
        out.println("<body>");
        request.getRequestDispatcher("navlibrarian.html").include(request, response);

        out.println("<div class='container'>");
        String callno = request.getParameter("callno");
        String studentid = request.getParameter("studentid");
        String studentname = request.getParameter("studentname");
        String sstudentmobile = request.getParameter("studentmobile");
        long studentmobile = Long.parseLong(sstudentmobile);

        IssueBookBean bean = new IssueBookBean(callno, studentid, studentname, studentmobile);
        int i = BookDao.issueBook(bean);
        out.println("<font color='white'>");
        out.println("<br><br><br><br><br><br><br>");
        out.println("<center>");
        if (i > 0) {
            out.println("<h1>Book issued successfully</h1>");
        } else {
            out.println("<h1>Sorry, unable to issue book.</h1><p>We may have sortage of books. Kindly visit later.</p>");
        }
        out.println("<center><font>");
        out.println("</div>");

        out.close();
    }

}
