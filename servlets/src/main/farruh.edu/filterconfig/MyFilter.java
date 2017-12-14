package filterconfig;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFilter implements Filter {
    FilterConfig config;

    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
        System.out.println("initializing");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        PrintWriter printWriter = servletResponse.getWriter();

        String isConstruction = config.getInitParameter("construction");
        if (isConstruction.equalsIgnoreCase("yes")){
            printWriter.print("This website is under construction");
        }else{
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    public void destroy() {
        System.out.println("destroy called");
    }
}
