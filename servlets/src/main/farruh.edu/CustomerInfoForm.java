import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CustomerInfoForm extends HttpServlet {


    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Initializing init method");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<h1> FirstName: "+req.getParameter("firstName")+"</h1>");
        printWriter.print("<h1> LastName: "+req.getParameter("lastName")+"</h1>");
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
