import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;


public class ServletConfig extends HttpServlet {

    javax.servlet.ServletConfig config;
    String values = "";

    @Override
    public void init(javax.servlet.ServletConfig config) throws ServletException {
        this.config = config;
        Enumeration<String> configs = config.getInitParameterNames();

        while (configs.hasMoreElements()){
            String value = configs.nextElement();
            String params = config.getInitParameter(value);

           values += "Value of this : " +value+ "------ params -><-: "+ params+"\n";
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<h1>WebConfig</h1>");
        printWriter.print(values);
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public javax.servlet.ServletConfig getServletConfig() {
        return super.getServletConfig();
    }
}
