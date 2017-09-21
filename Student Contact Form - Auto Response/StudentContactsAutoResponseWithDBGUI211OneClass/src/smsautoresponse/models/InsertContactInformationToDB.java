package smsautoresponse.models;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class InsertContactInformationToDB {
	
	public static DBCursor insertContactInformationToDB(Contact myContact){
			DB conn = (new MongoClient("127.0.0.1", 27017)).getDB("studentcontactdatabase");
			DBCollection channelDBCollection = conn.getCollection("studentcontacttable");
			channelDBCollection.dropIndexes();
			BasicDBObject document = new BasicDBObject();
			document.put("FirstName", myContact.firstName);
			document.put("LastName", myContact.lastName);
			document.put("Email", myContact.emailAddress);
			document.put("Phone", myContact.phoneNumber);
			document.put("Program", myContact.program);
			document.put("Semester", myContact.semester);
			document.put("Date", myContact.currentDate);
			document.put("Time", myContact.currentTime);
		
			channelDBCollection.insert(document);
		
			DBCursor cur = channelDBCollection.find();
			
		return cur;
	}
}