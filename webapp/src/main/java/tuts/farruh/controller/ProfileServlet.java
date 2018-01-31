package tuts.farruh.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        HttpSession session = req.getSession();

        if (session.getAttribute("username") == null || session.getAttribute("username").equals("")) {
            resp.getWriter().print("<h1>Error or Mistake</h1>");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        } else {
            printWriter.print("I am  " + session.getAttribute("username"));
            printWriter.print("<p><a href =/logout>Logout</a></p>");
        }
    }
}
