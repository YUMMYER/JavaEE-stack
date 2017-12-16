package cookies;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CookieServ1 extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Initialization");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();
        String username = req.getParameter("username");
        printWriter.print("Welcome : " + username);
        Cookie cookie = new Cookie("username", username);
        resp.addCookie(cookie);
        printWriter.print("<form action ='cookie2'>");
        printWriter.print("<input type='submit' value='go'/>");
        printWriter.print("</form>");
    }
}
