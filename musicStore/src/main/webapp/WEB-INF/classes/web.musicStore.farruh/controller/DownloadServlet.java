package controller;

import com.sun.org.apache.regexp.internal.RE;
import domain.User;
import domain.UserIO;
import utils.CookieUtil;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class DownloadServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Initializing download servlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "viewAlbums";
        }

        String url = "/index.jsp";
        if (action.equals("viewAlbums")) {
            url = "/index.jsp";
        } else if (action.equals("checkUser")) {
            url = checkUser(req, resp);
        }
        getServletContext().getRequestDispatcher(url).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        String url = "/index.jsp";

        if (action.equals("registerUser")) {
            url = registerUser(req,resp);
        }

        getServletContext().getRequestDispatcher(url).forward(req,resp);
    }

    private String registerUser(HttpServletRequest request, HttpServletResponse response) {
        String email = request.getParameter("email");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        User user = new User();
        user.setEmail(email);
        user.setFirstName(firstName);
        user.setLastName(lastName);

        ServletContext servletContext = getServletContext();
        String path = servletContext.getRealPath("WEB-INF/EmailList.txt");
        UserIO.addUser(user, path);

        HttpSession session = request.getSession();
        session.setAttribute("user", user);

        Cookie c = new Cookie("emailCookie", email);
        c.setMaxAge(60 * 60 * 24 * 365 * 2);
        c.setPath("/");
        response.addCookie(c);

        String productCode = (String) session.getAttribute("productCode");
        String url = "/" + productCode + "_download.jsp";
        return url;

    }

    private String checkUser(HttpServletRequest request, HttpServletResponse response) {

        String productCode = request.getParameter("productCode");

        HttpSession session = request.getSession();
        session.setAttribute("productCode", productCode);
        User user = (User) session.getAttribute("user");

        String url;

        if (user == null) {
            Cookie[] cookies = request.getCookies();
            String emailAddress = CookieUtil.getCookieValue(cookies, "emailCookie");

            if (emailAddress == null || emailAddress.equals("")) {
                url = "/register.jsp";
            } else {
                ServletContext servletContext = getServletContext();
                String path = servletContext.getRealPath("/WEB-INF/EmailList.text");
                user = UserIO.getUser(emailAddress, path);
                session.setAttribute("user", user);
                url = "/" + productCode + "_download.jsp";
            }
        } else {
            url = "/" + productCode + "_download.jsp";
        }
        return url;
    }
}
