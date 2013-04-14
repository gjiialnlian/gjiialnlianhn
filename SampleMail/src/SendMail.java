import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

public class SendMail {
	
	public static void main(String[] args) {
		sendMail();
	}
	
	private static void sendMail(){
		String to = "harris.molina08@yahoo.com";
		String from = "harris.molina08@yahoo.com";
		
		String[] toArr = null;
	      
	    if(!to.isEmpty())
	      toArr = to.split(";");
	      
		  Properties props = new Properties();
		  props.put("mail.smtp.host", "smtp.gmail.com");
		  props.put("mail.smtp.socketFactory.port", "465");
		  props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.port", "465");
	    
	    
//	      String from = "harris.molina08@yahoo.com";
//	      String host = "ssl://smtp.gmail.com:465";
//	      Properties properties = System.getProperties();
//	      properties.setProperty("mail.smtp.host", host);
	      //Session session = Session.getDefaultInstance(properties);

	      Session session = Session.getDefaultInstance(props,
	  			new javax.mail.Authenticator() {
	  				protected PasswordAuthentication getPasswordAuthentication() {
	  					return new PasswordAuthentication("maniladevtestmail@gmail.com","googletestmail ");
	  				}
	  			});
	      
	      
	      try{
	         MimeMessage message = new MimeMessage(session);
	         message.setFrom(new InternetAddress(from));
	         
	         InternetAddress[] addressTo = new InternetAddress[toArr.length];
	            for (int i = 0; i < toArr.length; i++){
	                addressTo[i] = new InternetAddress(toArr[i]);
	            }

	         message.setRecipients(RecipientType.TO, addressTo); 
	         message.setSubject("Testing only...");
	         message.setContent("TEST","text/html" );
	         // Send message
	         Transport.send(message);
	         System.out.println("Sent message successfully....");
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	}
}
