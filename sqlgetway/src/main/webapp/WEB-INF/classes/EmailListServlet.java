import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EmailListServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("called----");

        String to = "roteeinter.rup@gmail.com";
        String from = "farruh.habibullaev@gmail.com";
        String string = "Letter to my girlfriend!";

        String body = "Hello, my wife. How are you doing today. Is everything okay?";
        boolean isBodyHtml = false;

        try {
            MailUtilGmail.sendMail(to,from,string,body,isBodyHtml);
        } catch (MessagingException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
