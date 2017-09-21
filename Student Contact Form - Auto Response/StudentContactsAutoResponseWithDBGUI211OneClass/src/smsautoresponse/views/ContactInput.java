package smsautoresponse.views;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import smsautoresponse.models.EmailException;
import smsautoresponse.models.FirstNameException;
import smsautoresponse.models.LastNameException;
import smsautoresponse.models.PhoneNumberException;

public class ContactInput {	

	public static String getMyValidPhone(JTextField phoneTextField) {
		String txtPhoneNumber = null;
		String phoneNumber = null;
		boolean isInputValid = true;
		do{
			isInputValid = true;
			try{
				txtPhoneNumber = phoneTextField.getText();
				if(txtPhoneNumber.isEmpty()){
					throw new PhoneNumberException(txtPhoneNumber);
				}
				else if(!PhoneNumberValidator.isPhoneNumberValid(txtPhoneNumber))
					throw new PhoneNumberException(txtPhoneNumber);
				else
					phoneNumber = txtPhoneNumber;
			}
			catch (PhoneNumberException e){
				isInputValid = false;
				JOptionPane.showMessageDialog(null, e.getMessage());;
			}
		} while (isInputValid == false);
		
		return phoneNumber;

	}

	public static String getMyValidEmail(JTextField emailTextField) {
		String txtEmailAddress = null;
		String emailAddress = null;
		boolean isInputValid = true;
		do{
			isInputValid = true;
			try{
				txtEmailAddress = emailTextField.getText();
				if(txtEmailAddress.isEmpty()){
					throw new EmailException(txtEmailAddress);
				}
				if(!isValidEmail(txtEmailAddress)){
					throw new EmailException(txtEmailAddress);
				}
					
					emailAddress = txtEmailAddress;
			}
			
			catch (EmailException e){
				isInputValid = false;
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		} while (isInputValid == false);
		
		return emailAddress;
	}
	
	public static String getMyValidLastName(JTextField lastNameTextField) {
		String txtLastName = null;
		String lastName = null;
		boolean isInputValid = true;
		do{
			isInputValid = true;
			try{
				txtLastName = lastNameTextField.getText();
				if(txtLastName.isEmpty()){
					throw new LastNameException(txtLastName);
				}
				else if(!isValidLastName(txtLastName))
					throw new LastNameException(txtLastName);
				else
					lastName = txtLastName;
			}
			catch (LastNameException e){
				isInputValid = false;
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		} while (isInputValid == false);
		
		return lastName;
	}

	public static String getMyValidFirstName(JTextField firstNameTextField) {
		String txtFirstName = null;
		String firstName = null;
		boolean isInputValid = true;
		do{
			isInputValid = true;
			try{
				txtFirstName = firstNameTextField.getText();
				if(txtFirstName.isEmpty()){
					throw new FirstNameException(txtFirstName);
				}
				else if(!isValidFirstName(txtFirstName))
					throw new FirstNameException(txtFirstName);
				else
					firstName = txtFirstName;
			}
			catch (FirstNameException e){
				isInputValid = false;
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		} while (isInputValid == false);
		
		return firstName;
	}

	private static boolean isValidFirstName(String validName){
		return validName.matches("[a-zA-Z ,]+");
	}

	private static boolean isValidLastName(String validName){
		return validName.matches("[A-Za-z]+");
	}
	
	private static boolean isValidEmail(String validEmail){
		return validEmail.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		
	}

}
