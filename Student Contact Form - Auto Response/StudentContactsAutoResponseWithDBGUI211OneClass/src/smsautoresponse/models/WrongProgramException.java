package smsautoresponse.models;

public class WrongProgramException extends Exception {
	
	public WrongProgramException (String txtValidProgram) {
		super(">>> Error: Please enter the proper program.");
	}
	public WrongProgramException (int validProgram) {
		super(">>> Error: Please enter the proper program.");
	}
}
