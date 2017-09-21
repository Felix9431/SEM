package smsautoresponse.models;

import java.util.Date;

public class Contact {

	public String firstName;
	public String lastName;
	public String emailAddress;
	public String phoneNumber;
	public int program;
	public int semester;
	public Date currentDate;
	public String currentTime;

	public Contact(String firstName, String lastName, String emailAddress, String phoneNumber, int program, int term, Date currentDate, String currentTime){
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.program = program;
		this.semester = term;
		this.currentDate = currentDate;
		this.currentTime = currentTime;

		
	}
	
}
