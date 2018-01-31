package tuts.farruh.filter;

import tuts.farruh.database.Database;
import tuts.farruh.domain.LoginUser;

import javax.servlet.*;
import java.io.IOException;
import java.util.logging.Filter;

public class Auth implements javax.servlet.Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Initialized");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String username = servletRequest.getParameter("username");
        String password = servletRequest.getParameter("password");
        if (Database.isUserExist(new LoginUser(username, password))) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            servletResponse.getWriter().print("Error or password error");
            RequestDispatcher dispatcher = servletRequest.getRequestDispatcher("login.jsp");
            dispatcher.forward(servletRequest, servletResponse);
        }

    }

    public void destroy() {
        System.out.println("Destroyed");
    }
}
