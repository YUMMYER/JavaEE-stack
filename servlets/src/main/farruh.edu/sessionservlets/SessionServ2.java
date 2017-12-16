package sessionservlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionServ2 extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Initialization");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Do get method");
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        String username = req.getParameter("username");
        printWriter.print("Welcome " + username);
        HttpSession session = req.getSession();
        session.setAttribute("username",username);
        session.setAttribute("role","Admin");
        printWriter.print("<a href='servlet1'>: visit</a>");



    }

    @Override
    public void destroy() {
        System.out.println("Destroy");
    }
}
