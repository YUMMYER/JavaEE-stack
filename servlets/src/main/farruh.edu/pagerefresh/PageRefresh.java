package pagerefresh;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PageRefresh extends HttpServlet {
    int counter = 0;
    @Override
    public void init() throws ServletException {
        System.out.println("init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setIntHeader("Refresh",5);

        PrintWriter printWriter = resp.getWriter();
        printWriter.print("Counter counting: " + counter++);
    }
}
