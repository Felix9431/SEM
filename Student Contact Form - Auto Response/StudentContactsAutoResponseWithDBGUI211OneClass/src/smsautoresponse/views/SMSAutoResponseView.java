package smsautoresponse.views;

import com.twilio.rest.api.v2010.account.Message; 

public class SMSAutoResponseView {

	public static void displayTextMessageSID(Message message){
		System.out.println("The message SID is : " + message.getSid()); 
	}
	
	public static void displayTextMessageSender(Message message){
		System.out.println("The message is sent From : " + message.getFrom()); 
	}
	
	public static void displayTextMessageReceiver(Message message){
		System.out.println("The message is sent To : " + message.getTo()); 
	}
	
	public static void displayTextMessageContent(Message message){
		System.out.println("The message contains : \n" + message.getBody()); 
	}

}
