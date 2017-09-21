package smsautoresponse.models;

public class LastNameException extends Exception {

	public LastNameException (String txtLastName) {
		super(">>> Error: Please enter your last name correctly.");
	}
	
}
