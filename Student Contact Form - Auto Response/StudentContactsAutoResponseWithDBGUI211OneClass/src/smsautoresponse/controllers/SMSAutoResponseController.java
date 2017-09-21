package smsautoresponse.controllers;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;

import smsautoresponse.models.AcademicAdvisor;
import smsautoresponse.models.Contact;
import smsautoresponse.models.SMSAutoResponse;
import smsautoresponse.views.SMSAutoResponseView;

public class SMSAutoResponseController {

	public static void sendSMSAutoResponse(Contact myContact){
	SMSAutoResponse.getConnectionToAccount();
	AcademicAdvisor yourAcademicAdvisor = AcademicAdvisor.GetYourAcademicAdvisor(myContact.program);
	String textMessageContent = SMSAutoResponse.ConstructMessage(myContact.firstName, yourAcademicAdvisor);
	PhoneNumber recieverPhoneNumber = SMSAutoResponse.getRecieverPhoneNumber(myContact.phoneNumber);
	MessageCreator messageCreator = SMSAutoResponse.createTextMessage(recieverPhoneNumber, textMessageContent);
	
	
    Message message = messageCreator.create();
    
    SMSAutoResponseView.displayTextMessageSID(message);
    SMSAutoResponseView.displayTextMessageSender(message);
    SMSAutoResponseView.displayTextMessageReceiver(message);
    SMSAutoResponseView.displayTextMessageContent(message);
	}
}
