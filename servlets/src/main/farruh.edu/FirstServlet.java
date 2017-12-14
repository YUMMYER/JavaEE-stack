import javax.servlet.*;
import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/firstServlet")
public class FirstServlet implements Servlet{

    ServletConfig config;

    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
        System.out.println("Initialization method has been called");
    }



    public ServletConfig getServletConfig() {

        return config;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service method has been called");
        servletResponse.setContentType("text/html");

        PrintWriter printWriter = servletResponse.getWriter();
        printWriter.print("<h1>First Response Hello simple first servlet</h1>");
        printWriter.print("Information of servlet info : " + getServletInfo());
        printWriter.print("Configuration information info : " +  getServletConfig());
    }

    public String getServletInfo() {
        return "Servlet information";
    }

    public void destroy() {

    }
}
