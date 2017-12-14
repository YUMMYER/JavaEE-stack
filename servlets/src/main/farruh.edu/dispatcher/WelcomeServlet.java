package dispatcher;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WelcomeServlet extends HttpServlet{
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Initializing");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
       // String username = req.getParameter("username");
        printWriter.print("Welcome ");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
