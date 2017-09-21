package smsautoresponse.models;

public class EmailException extends Exception {

	public EmailException (String txtFirstName) {
		super(">>> Error: Please enter your e-mail correctly.");
	}
	
}
