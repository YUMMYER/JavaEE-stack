package tuts.farruh.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        if (httpSession.getAttribute("username") != null) {
            httpSession.invalidate();
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
        resp.getWriter().print("Successfully logged out");
    }
}
