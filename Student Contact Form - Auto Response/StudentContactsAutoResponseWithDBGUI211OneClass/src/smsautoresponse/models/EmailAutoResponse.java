package smsautoresponse.models;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailAutoResponse {
	  
	private static String USER_NAME = "rezakhamesipour";  // GMail user name (just the part before "@gmail.com")
	private static String PASSWORD = "!Alireza54263747867"; // GMail password
	private static String host = "smtp.gmail.com";
	
	private static String subject;
    private static String body;
    
    public static Properties sendFromGMail(String from, String to, String subject, String body) {
        Properties props = System.getProperties();
        props.put("mail.smtp.starttls.enable", true);
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", PASSWORD);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        return props;
    }
    
    public static Session setupSession(Properties props) {
        Session session = Session.getDefaultInstance(props);
		return session;
	}
    
	public static MimeMessage setupMimeMessage(Session session) {
        MimeMessage message = new MimeMessage(session);
		return message;
	}

	public static void setupSendersEmailAddress(MimeMessage emailMessage, String from) throws AddressException, MessagingException{
            emailMessage.setFrom(new InternetAddress(from));
	}            
     
	public static void setRecieversEmailAddress(MimeMessage emailMessage, String to) throws MessagingException{
            InternetAddress toAddress = new InternetAddress(to);
            emailMessage.addRecipient(Message.RecipientType.TO, toAddress);
	}
	
    public static void setupEmailContent(MimeMessage emailMessage, String subject, String body) throws MessagingException{
			emailMessage.setSubject(subject);
            emailMessage.setText(body);
    }
    
    public static Transport setupMailProtocol(Session session) throws NoSuchProviderException {
        Transport transport = session.getTransport("smtp");
		return transport;
	}

	public static void establishConnectionToSendersEmail(Transport transport) throws MessagingException {
        transport.connect(host, USER_NAME, PASSWORD);
	}

	public static void sendEmailMessage(Transport transport, MimeMessage emailMessage) throws MessagingException {
        transport.sendMessage(emailMessage, emailMessage.getAllRecipients());				
	}

	public static void closeConnectionToSendersEmail(Transport transport) throws MessagingException {
        transport.close();		
	}

	public static String setSubjectOfEmail() {
		subject = "SIU-ODIRS Auto-Response";
	return subject;
	}

	public static String setBodyOfEmail(Contact myContact) {
		String studentProgram = null;
		String studentAdvisor = null;
		String studentProgramWebsite = null;
		
		if (myContact.program == 1){
			studentProgram = "Information Systems Technologies (IST) Online Program";
			studentAdvisor = "IST advisor, Shannon Gwaltney";
			studentProgramWebsite = "http://ist.siu.edu/";
		}
		if (myContact.program == 2){
			studentProgram = "Information Systems Technologies (IST) On-Campus Program";
			studentAdvisor = "IST advisor, Shannon Gwaltney";
			studentProgramWebsite = "http://ist.siu.edu/";
		}
		
		if (myContact.program == 6){
			studentProgram = "Electronics Systems Technologies (EST) Off-Campus Program";
			studentAdvisor = "EST advisor, Jill Mueller";
			studentProgramWebsite = "http://est.siu.edu/";
		}
		
		if (myContact.program == 5){
			studentProgram = "Electronics Systems Technologies (EST) Online Program";
			studentAdvisor = "EST advisor, Jill Mueller";
			studentProgramWebsite = "http://est.siu.edu/";
		}
		
		if (myContact.program == 4){
			studentProgram = "Technical Resource Management (TRM) On-Campus Program";
			studentAdvisor = "TRM advisor, Shannon Gwaltney";
			studentProgramWebsite = "http://trm.siu.edu/";
		}
		
		if (myContact.program == 3){
			studentProgram = "Technical Resource Management (TRM) Online Program";
			studentAdvisor = "TRM advisor, Shannon Gwaltney";
			studentProgramWebsite = "http://trm.siu.edu/";
		}
		
		 body = "Hello " + myContact.firstName + "\n" + 
		    	    "Thank you for your interest in the " + studentProgram +
		    	    " offered through Southern Illinois University Carbondale. The " + studentAdvisor +
		    	    " will contact you shortly with more information.\n\n" +
		    	    "Have a good day, \n" +
		    	    "Please visit our webpage at :\n" + 
		    	    "http://www.isat.siu.edu\n" + 
		    	    studentProgramWebsite + "\n" +
		    	    "And our Facebook Page :\n" +
		    	    "https://www.facebook.com/ISAT-Southern-Illinois-University-126932176994/\n";
		return body;
	}

	public static String getSendersUserName() {
		return USER_NAME;
	} 

}
