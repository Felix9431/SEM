package smsautoresponse.models;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;

public class SMSAutoResponse {

	private static String ACCOUNT_SID = "AC6399a4c1be724d7278dddeaedb5d747d"; 
	private static String AUTH_TOKEN = "a879a034f04f2e6a579f5a520ec1dabb"; 
	
	
	private static PhoneNumber to = new PhoneNumber("+16183039636");
	private static PhoneNumber from = new PhoneNumber("+16183197220");
	
	public static void getConnectionToAccount(){ 
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN); 
	}

	public static String ConstructMessage(String studentContactName, AcademicAdvisor yourAcademicAdvisor){
		String message = "Hello " + studentContactName + ", \n" + 
				"Please Contact : \n" +
				yourAcademicAdvisor.getAcademicAdvisorContactInfo() + "\n" +
				"Please Visit : \n\n" +
				"https://www.facebook.com/ISAT-Southern-Illinois-University-126932176994/";
				return message;
	}
	
	public static MessageCreator createTextMessage(PhoneNumber to, String message){
		MessageCreator messageCreator = Message.creator(ACCOUNT_SID, to, from, message );
		//System.out.println("message length is " + message.length());
	return messageCreator;
	}
	
	public static PhoneNumber getRecieverPhoneNumber(String phoneNumber){
		phoneNumber = "+1" + phoneNumber;
		PhoneNumber recieverPhoneNumber = new PhoneNumber(phoneNumber);
		
		return recieverPhoneNumber;
	}
}
