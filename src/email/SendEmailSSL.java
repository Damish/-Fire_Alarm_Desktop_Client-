
/**
 *
 * @author Damish
 */

package email;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendEmailSSL{

    
    static String emailtoSendStatus = " ";
    
    public static void setEmail(String email){
    
        emailtoSendStatus = email;
    
    }
    
    public static Session mailActivity(){
        
        final String username = "firealarmservice2@gmail.com";
        final String password = "admin@12345";

        Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

       return session;
    }
    
    
    public static void createMail(Session session ,String sid,int floor,int room){
    
     try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("firealarmservice2@gmail.com"));
           
            
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(emailtoSendStatus)
            );
           
            message.setSubject("FIRE WARNING!!!!!!!!!!! call 119");
            message.setText("Automatic fire management system found that a fire alarm was turned on in #Sensor id :___"+sid+ "___#FLOOR:___" + floor + "___#ROOM:___" + room + "."
                    + "\n\n Come and check the situation."
                    + "\n\n This is critical.If you are unable to come at the moment, call 119 and ask for support."
                    + "\n\n\n\nAlarms Administrator"
                    + "\nFire Alarm System management team,"
                    + "\nSLIIT,"
                    + "\nMalabe.");

            Transport.send(message);

            System.out.println("Email Sent successfully!!!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    
    }

    
    
    
}