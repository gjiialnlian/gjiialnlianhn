package org.mmedev.email;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.camel.ProducerTemplate;

public class MyAccountEmail {
	
	private ProducerTemplate producer;
	
	public void sendEmail(){
		Map<String, Object> header = new HashMap<String, Object>();
		header.put("To", "harris.molina08@yahoo.com");
		header.put("Subject", "My Account Email notification TEST ONLY");
		header.put("From", "harrism@nwsol.com");
		producer.sendBodyAndHeaders("direct:myAccountEmailProcessor","", header);
	}
	
	public void sendEmail2(){
		
		String to = "harris.molina08@yahoo.com;harrism@nwsol.com";
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

	         message.setRecipients(Message.RecipientType.TO, addressTo); 
	         message.setSubject("Testing only...");
	         message.setContent("TEST","text/html" );
	         // Send message
	         Transport.send(message);
	         System.out.println("Sent message successfully....");
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	}
	

	public ProducerTemplate getProducer() {
		return producer;
	}

	public void setProducer(ProducerTemplate producer) {
		this.producer = producer;
	}
}
