import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailUtilGmail {

    public static void sendMail(String to, String from, String subject, String body, boolean isBodyHtml) throws MessagingException {
        Properties properties = new Properties();
        properties.put("mail.transport.protocol","smtps");
        properties.put("mail.smtps.host","smtp.gmail.com");
        properties.put("mail.smtps.port",465);
        properties.put("mail.smtps.auth","true");
        properties.put("mail.smtps.quitwait","false");
        Session session = Session.getDefaultInstance(properties);
        session.setDebug(true);

        Message message = new MimeMessage(session);
        message.setSubject(subject);
        if (isBodyHtml){
            message.setContent(body,"text/html");
        }else{
            message.setText(body);
        }

        Address fromAddress = new InternetAddress(from);
        Address addressTo = new InternetAddress(to);
        message.setFrom(fromAddress);
        message.setRecipient(Message.RecipientType.TO,addressTo);

        Transport transport = session.getTransport();
        transport.connect("farruh.habibullaev@gmail.com","farrawest");
        transport.sendMessage(message,message.getAllRecipients());
        transport.close();
    }
}
