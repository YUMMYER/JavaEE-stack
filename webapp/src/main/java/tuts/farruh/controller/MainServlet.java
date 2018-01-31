package tuts.farruh.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("username", req.getParameter("username"));
        session.setMaxInactiveInterval(3600);

        PrintWriter printWriter = resp.getWriter();
        resp.setContentType("text/html");
        printWriter.print("Hello World ," + session.getAttribute("username"));
        printWriter.print("<p><a href =/logout>Logout</a></p>");
        printWriter.print("<p><a href =/profile>Profile</a></p>");
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
