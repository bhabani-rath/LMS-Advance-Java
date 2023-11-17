package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.BookBean;
import Dao.BookDao;

@WebServlet("/AddBook")
public class AddBook extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.println("<head>");
        out.println("<title>Add Book Form</title>");

        out.println("</head>");
        out.println("<body>");
        request.getRequestDispatcher("navlibrarian.jsp").include(request, response);

        out.println("<div>");
        String callno = request.getParameter("callno");
        String name = request.getParameter("name");
        String author = request.getParameter("author");
        String publisher = request.getParameter("publisher");
        String squantity = request.getParameter("quantity");
        int quantity = Integer.parseInt(squantity);
        BookBean bean = new BookBean(callno, name, author, publisher, quantity);
        out.println("<font color='white'>");
        out.println("<br><br><br><br><br><br><br>");
        out.println("<center>");
        int i = BookDao.save(bean);
        if (i > 0) {
            out.println("<h1>Book saved successfully</h1>");
        }
        out.println("</center>");
        out.println("</font>");
        request.getRequestDispatcher("addbookform.jsp").include(request, response);
        out.println("</div>");
        out.close();
    }

}
