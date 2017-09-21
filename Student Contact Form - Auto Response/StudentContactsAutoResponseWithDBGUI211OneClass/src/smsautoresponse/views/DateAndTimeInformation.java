package smsautoresponse.views;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTimeInformation {
	
	public static String getCurrentTime(SimpleDateFormat sdf) {
		Date dt = new Date();
		String currentTime = sdf.format(dt).substring(11);
		return currentTime;
	}

	public static SimpleDateFormat getDateFormat() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf;
	}

	public static Date getCurrentDate(SimpleDateFormat sdf) {
		Date dt = new Date();	
		return dt;
	}
	
}
