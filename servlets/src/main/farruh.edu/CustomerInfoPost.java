import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CustomerInfoPost extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Initializing");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter printWriter  = resp.getWriter();
        printWriter.print("<h1> FirstName: "+req.getParameter("firstName")+"</h1>");
        printWriter.print("<h1> LastName: "+req.getParameter("lastName")+"</h1>");

        String [] books = req.getParameterValues("bookname");
        printWriter.print("<h1> BookName: </h1>");
        printWriter.print("<ul>");
        for (String book:books){
            printWriter.print("<li>"+book+"</li>");
        }
        printWriter.print("</ul>");
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
