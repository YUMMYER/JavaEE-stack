package countlogindemo;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class CountListener implements HttpSessionListener {

    ServletContext servletContext;
    static int  totalCounter = 0, currentCounter = 0;

    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        servletContext = httpSessionEvent.getSession().getServletContext();
        totalCounter++;
        currentCounter++;
        servletContext.setAttribute("totaluser",totalCounter);
        servletContext.setAttribute("currentuser",currentCounter);
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        currentCounter--;
        servletContext.setAttribute("currentuser",currentCounter);
    }
}
