package smsautoresponse.models;

public class WrongTermException extends Exception {
	
	public WrongTermException (String txtValidTerm) {
		super(">>> Error: Please enter the proper program.");
	}
	public WrongTermException (int validTerm) {
		super(">>> Error: Please enter the proper program.");
	}
}
