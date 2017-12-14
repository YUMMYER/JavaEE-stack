package dispatcher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Initializing the event");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (username.equalsIgnoreCase("farruh") && password.equalsIgnoreCase("farruh")){
//            RequestDispatcher dispatcher = req.getRequestDispatcher("/welcome");
//            dispatcher.forward(req,resp);
            resp.sendRedirect("http://localhost:8080/welcome");
        }else{
            printWriter.print("Sorry username or password is wrong");
            RequestDispatcher dispatcher = req.getRequestDispatcher("/login.html");
            dispatcher.include(req,resp);
        }
    }

    @Override
    public void destroy() {
        System.out.println("Destroy method");
    }
}
