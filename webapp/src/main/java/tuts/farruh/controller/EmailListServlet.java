package tuts.farruh.controller;



import tuts.farruh.domain.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EmailListServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = "/index.jsp";

        String action = req.getParameter("action");
        if (action == null) {
            action = "join";
        }

        if (action.equals("add")) {
            String firstName = req.getParameter("firstName");
            String lastName = req.getParameter("lastName");
            String email = req.getParameter("email");

            User user = new User(firstName, lastName, email);
            req.setAttribute("user", user);
            url = "/thanks.jsp";
        }
        getServletContext().getRequestDispatcher(url).forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
