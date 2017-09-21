package smsautoresponse.controllers;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

import smsautoresponse.models.Contact;
import smsautoresponse.models.EmailAutoResponse;


public class EmailAutoResponseController {
	
	public static void sendEmailAutoResponse(Contact myContact) throws MessagingException{
		
	 String body = EmailAutoResponse.setBodyOfEmail(myContact);
     String subject = EmailAutoResponse.setSubjectOfEmail();
     String from = EmailAutoResponse.getSendersUserName();
     Properties props = EmailAutoResponse.sendFromGMail(from, myContact.emailAddress, subject, body);
     Session session = EmailAutoResponse.setupSession(props);
     MimeMessage emailMessage = EmailAutoResponse.setupMimeMessage(session);
     
     EmailAutoResponse.setupSendersEmailAddress(emailMessage, from);
     EmailAutoResponse.setRecieversEmailAddress(emailMessage, myContact.emailAddress);
     EmailAutoResponse.setupEmailContent(emailMessage, subject, body);
     Transport transport = EmailAutoResponse.setupMailProtocol(session);
     EmailAutoResponse.establishConnectionToSendersEmail(transport);
     EmailAutoResponse.sendEmailMessage(transport, emailMessage);
     EmailAutoResponse.closeConnectionToSendersEmail(transport);
	
	}

}
