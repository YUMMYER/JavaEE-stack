package cookies;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CookieServ2 extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("initc2");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        Cookie[] cookies = req.getCookies();
        printWriter.print("Hello" + cookies[0].getValue());
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
