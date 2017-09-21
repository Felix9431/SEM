package smsautoresponse.models;

public class WrongYearException extends Exception {
	
	public WrongYearException (String txtValidYear) {
		super(">>> Error: Please enter the year you wish to enroll in : ");
	}
	public WrongYearException (int validYear, int current) {
		super(">>> Error: You can not be enrolled for " + validYear + ", please enter a year after " + current + ".");
	}
}
