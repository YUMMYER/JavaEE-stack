package countlogindemo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Init method");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String username = req.getParameter("username");
        HttpSession session = req.getSession();
        session.setAttribute("username",username);

        ServletContext servletContext = getServletContext();
        int totaluser = (Integer) servletContext.getAttribute("totaluser");
        int currentUser = (Integer) servletContext.getAttribute("currentuser");

        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<br> total user : " + totaluser);
        printWriter.print("<br> current user :" + currentUser);
        printWriter.print("<a href='logout1'>logout</a>");
        printWriter.close();


    }
}
