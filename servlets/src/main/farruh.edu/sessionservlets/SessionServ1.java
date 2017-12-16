package sessionservlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionServ1 extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        HttpSession session = req.getSession();
        printWriter.print("Hello username : " +session.getAttribute("username")+"</br>");
        printWriter.print("role: " +session.getAttribute("role")+" and id " +session.getId());

    }

    @Override
    public void destroy() {
        System.out.println("destroy servlet 1");
    }
}
