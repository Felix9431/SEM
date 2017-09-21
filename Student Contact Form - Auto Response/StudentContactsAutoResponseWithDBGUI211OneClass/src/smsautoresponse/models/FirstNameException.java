package smsautoresponse.models;

public class FirstNameException extends Exception {
	
	public FirstNameException (String txtFirstName) {
		super(">>> Error: Please enter your first name correctly.");
	}
	
}
