package smsautoresponse.models;

public class PhoneNumberException extends Exception {

	public PhoneNumberException (String txtLastName) {
		super(">>> Error: Please enter your phone number correctly.");
	}
}
