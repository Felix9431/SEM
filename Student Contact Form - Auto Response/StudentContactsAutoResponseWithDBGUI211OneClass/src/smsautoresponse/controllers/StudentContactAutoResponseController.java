package smsautoresponse.controllers;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import smsautoresponse.models.Contact;
import smsautoresponse.models.DBDriver;
import smsautoresponse.models.InsertContactInformationToDB;
import smsautoresponse.views.ContactView;

public class StudentContactAutoResponseController {
	static Contact myContact = null;
	
	public static void main(String[] args) throws NullPointerException {
	
		
				DBDriver.connectToDB();
				StudentContactForm.studentFormView();
	}
		
	
}
