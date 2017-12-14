package filterconfig;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class LogFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.setContentType("text/html");
        PrintWriter out = servletResponse.getWriter();
        String ipAddress = servletRequest.getRemoteAddr();
        out.print("IpAddress: " +ipAddress+ "</br> current time: " + new Date()+"</br>");
        out.print("Filter called Before </br>");
        filterChain.doFilter(servletRequest,servletResponse);
        out.print("Filter called after </br>");

    }

    public void destroy() {
        System.out.println("destroy");
    }
}
