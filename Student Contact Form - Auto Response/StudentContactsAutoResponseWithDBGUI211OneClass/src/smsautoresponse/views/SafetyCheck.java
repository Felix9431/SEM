package smsautoresponse.views;

import javax.swing.JOptionPane;

public class SafetyCheck {
	
	public static String spamCheck() {
		String preventSpam = JOptionPane.showInputDialog("Please enter S@luki to prevent spam");
		if(isValidSpam(preventSpam))
			return preventSpam;
		else{
			return null;
		}
	}

	public static void DisplaySafetyCheckError() {
		JOptionPane.showMessageDialog(null, "You are suspicious of being a Computer!!!!");
	System.exit(0);
	}

	private static boolean isValidSpam(String preventSpam){
		return preventSpam.matches("S@luki");
	}

}
