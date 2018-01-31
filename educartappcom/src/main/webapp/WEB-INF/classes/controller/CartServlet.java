package controller;

import db.ProductIO;
import domain.Cart;
import domain.LineItem;
import domain.Product;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class CartServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();

        String action = req.getParameter("action");

        if (action == null) {
            action = "cart";
        }

        String url = "/index.jsp";

        if (action.equals("shop")) {
            url = "/index.jsp";

        } else if (action.equals("cart")) {
            String productCode = req.getParameter("productCode");
            String productQuantity = req.getParameter("quantity");

            HttpSession session = req.getSession();
            Cart cart = (Cart) session.getAttribute("cart");

            if (cart == null) {
                cart = new Cart();
            }

            int quantity;

            try {
                quantity = Integer.parseInt(productQuantity);
                if (quantity < 0) {
                    quantity = 1;
                }
            } catch (NumberFormatException e) {
                quantity = 1;
            }

            String path = servletContext.getRealPath("/WEB-INF/products.txt");
            Product product = ProductIO.getProduct(productCode, path);

            LineItem lineItem = new LineItem();
            lineItem.setQuantity(quantity);
            lineItem.setProduct(product);

            if (quantity > 0) {
                cart.addItems(lineItem);
            } else if (quantity == 0) {
                cart.removeItem(lineItem);
            }

            session.setAttribute("cart", cart);
            url = "/cart.jsp";
        } else if (action.equals("checkout")) {
            url = "/checkout.jsp";
        }

        servletContext.getRequestDispatcher(url).forward(req, resp);
    }
}
