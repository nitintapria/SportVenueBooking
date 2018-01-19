package contr;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SM {
private String from;
private String to;
private String subject;
private String text;
private String pass;

public SM(String from,String pass, String to, String subject, String text)
{this.from = from;
 this.pass=pass;
 this.to = to; 
 this.subject = subject;
 this.text = text;}

public int send(){
    int i=0;
String host = "smtp.gmail.com";
String userid = from;
String p = pass;
try
{
Properties props = System.getProperties();
props.put("mail.smtp.starttls.enable", "true");
props.put("mail.smtp.host", host);
props.setProperty("mail.transport.protocol", "smtps");
props.put("mail.smtp.user", userid);
props.put("mail.smtp.password", p);
props.put("mail.smtp.port", "587");
props.put("mail.smtps.auth", "true");
Session session = Session.getDefaultInstance(props, null);
MimeMessage message = new MimeMessage(session);
InternetAddress fromAddress = null;
InternetAddress toAddress = null;

try {
fromAddress = new InternetAddress(from);
toAddress = new InternetAddress(to);
} catch (AddressException e) {

e.printStackTrace();
}
message.setFrom(fromAddress);
message.setRecipient(RecipientType.TO, toAddress);

message.setSubject(subject);
//message.setText(text);
message.setContent(text, "text/html");
//SMTPSSLTransport transport =(SMTPSSLTransport)session.getTransport("smtps");

Transport transport = session.getTransport("smtps");
transport.connect(host, userid, p);
transport.sendMessage(message, message.getAllRecipients());
i=1;
transport.close();
} catch (MessagingException e) {
//    JOptionPane.showMessageDialog(this, "User name or password not match");
e.printStackTrace();
}
return i;
}

}
