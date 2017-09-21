package smsautoresponse.models;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class DBDriver {

	private static final DBCollection DBCollection = null;

	public static DBCollection connectToDB(){
		try{
			DB conn = (new MongoClient("127.0.0.1", 27017)).getDB("studentcontactdatabase");
			DBCollection channelDBCollection = conn.getCollection("studentcontacttable");
		}
		catch(Exception exc){
			exc.printStackTrace();
		}
		return DBCollection;
	}
	
}
