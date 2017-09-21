package smsautoresponse.controllers;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import smsautoresponse.models.Contact;
import smsautoresponse.models.InsertContactInformationToDB;
import smsautoresponse.views.ContactInput;
import smsautoresponse.views.DateAndTimeInformation;
import smsautoresponse.views.ProgramPanel;
import smsautoresponse.views.SemesterYearPanel;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class StudentContactForm extends JFrame {

	private JPanel contentPane;
	private JTextField firstNameTextField;
	private JTextField lastNameTextField;
	private JTextField emailTextField;
	private JTextField phoneTextField;
	private JTextField pleaseEnterSlukitextField;
	private ButtonGroup bg = new ButtonGroup();
	private ButtonGroup bg2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void studentFormView(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					StudentContactForm frame = new StudentContactForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	/**
	 * Create the frame.
	 */
	public StudentContactForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1368, 689);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(24, 250, 354, 255);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFirstName.setBounds(31, 80, 90, 14);
		panel.add(lblFirstName);
		
		firstNameTextField = new JTextField();
		firstNameTextField.setBounds(159, 80, 141, 20);
		panel.add(firstNameTextField);
		firstNameTextField.setColumns(10);
		
		
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLastName.setBounds(31, 105, 90, 14);
		panel.add(lblLastName);
		
		lastNameTextField = new JTextField();
		lastNameTextField.setColumns(10);
		lastNameTextField.setBounds(159, 105, 141, 20);
		panel.add(lastNameTextField);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmail.setBounds(31, 130, 66, 14);
		panel.add(lblEmail);
		
		emailTextField = new JTextField();
		emailTextField.setColumns(10);
		emailTextField.setBounds(159, 130, 141, 20);
		panel.add(emailTextField);
		
		JLabel lblPhoneNumber = new JLabel("Phone #");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPhoneNumber.setBounds(31, 155, 109, 14);
		panel.add(lblPhoneNumber);
		
		phoneTextField = new JTextField();
		phoneTextField.setColumns(10);
		phoneTextField.setBounds(159, 155, 141, 20);
		panel.add(phoneTextField);
		
		JLabel lblPleaseEnterSluki = new JLabel("Please enter S@luki");
		lblPleaseEnterSluki.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPleaseEnterSluki.setBounds(31, 209, 118, 14);
		panel.add(lblPleaseEnterSluki);
		
		pleaseEnterSlukitextField = new JTextField();
		pleaseEnterSlukitextField.setColumns(10);
		pleaseEnterSlukitextField.setBounds(159, 209, 141, 20);
		panel.add(pleaseEnterSlukitextField);
		
		JLabel lblPersonalInformation = new JLabel("Personal Information");
		lblPersonalInformation.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblPersonalInformation.setBounds(20, 11, 313, 34);
		panel.add(lblPersonalInformation);
		
		JPanel programInfoPanel = new JPanel();
		programInfoPanel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		programInfoPanel.setBounds(401, 81, 494, 273);
		contentPane.add(programInfoPanel);
		programInfoPanel.setLayout(null);
		
		JLabel lblProgramInformation = new JLabel("Program Information");
		lblProgramInformation.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblProgramInformation.setBounds(24, 11, 318, 40);
		programInfoPanel.add(lblProgramInformation);
		
		JLabel lblWhichProgramWould = new JLabel("Which program would you like to apply for?");
		lblWhichProgramWould.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblWhichProgramWould.setBounds(34, 62, 375, 54);
		programInfoPanel.add(lblWhichProgramWould);
		
		JRadioButton rdbtnInformationSystemsTechnologyist = new JRadioButton("Information Systems Technology(IST) Online");
		rdbtnInformationSystemsTechnologyist.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnInformationSystemsTechnologyist.setSelected(true);
		rdbtnInformationSystemsTechnologyist.setBounds(71, 105, 390, 23);
		programInfoPanel.add(rdbtnInformationSystemsTechnologyist);
		
		JRadioButton rdbtnInformationSystemsTechnologyist_1 = new JRadioButton("Information Systems Technology(IST) On-Campus");
		rdbtnInformationSystemsTechnologyist_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnInformationSystemsTechnologyist_1.setBounds(74, 131, 387, 23);
		programInfoPanel.add(rdbtnInformationSystemsTechnologyist_1);
		
		JRadioButton rdbtnTechnicalResourceManagementtrm = new JRadioButton("Technical Resource Management(TRM) Online");
		rdbtnTechnicalResourceManagementtrm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnTechnicalResourceManagementtrm.setBounds(74, 157, 387, 23);
		programInfoPanel.add(rdbtnTechnicalResourceManagementtrm);
		
		JRadioButton rdbtnTechnicalResourceManagementtrm_1 = new JRadioButton("Technical Resource Management(TRM) On-Campus");
		rdbtnTechnicalResourceManagementtrm_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnTechnicalResourceManagementtrm_1.setBounds(71, 183, 390, 23);
		programInfoPanel.add(rdbtnTechnicalResourceManagementtrm_1);
		
		JRadioButton rdbtnElectronicsSystemsTechnologyest = new JRadioButton("Electronics Systems Technology(EST) Online");
		rdbtnElectronicsSystemsTechnologyest.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnElectronicsSystemsTechnologyest.setBounds(71, 209, 390, 23);
		programInfoPanel.add(rdbtnElectronicsSystemsTechnologyest);
		
		JRadioButton rdbtnElectronicsSystemsTechnologyest_1 = new JRadioButton("Electronics Systems Technology(EST) On-Campus");
		rdbtnElectronicsSystemsTechnologyest_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnElectronicsSystemsTechnologyest_1.setBounds(71, 235, 390, 23);
		programInfoPanel.add(rdbtnElectronicsSystemsTechnologyest_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setBounds(922, 365, 176, 140);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblStudentContactForm = new JLabel("Student Contact Form");
		lblStudentContactForm.setFont(new Font("Times New Roman", Font.ITALIC, 70));
		lblStudentContactForm.setBounds(160, 11, 674, 59);
		contentPane.add(lblStudentContactForm);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(401, 365, 494, 200);
		contentPane.add(panel_4);
		
		JLabel lblEnrollmentDate = new JLabel("Semester to be enrolled");
		lblEnrollmentDate.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblEnrollmentDate.setBounds(24, 11, 416, 40);
		panel_4.add(lblEnrollmentDate);
		
		JLabel lblWhenWouldYou = new JLabel("When would you like to apply for SIU?");
		lblWhenWouldYou.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblWhenWouldYou.setBounds(34, 62, 375, 54);
		panel_4.add(lblWhenWouldYou);
		
		JRadioButton rdbtnFall = new JRadioButton("Fall 2017");
		rdbtnFall.setSelected(true);
		rdbtnFall.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnFall.setBounds(71, 105, 390, 23);
		panel_4.add(rdbtnFall);
		
		JRadioButton rdbtnSpring = new JRadioButton("Spring 2018");
		rdbtnSpring.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnSpring.setBounds(74, 131, 387, 23);
		panel_4.add(rdbtnSpring);
		
		JRadioButton rdbtnSummer = new JRadioButton("Summer 2018");
		rdbtnSummer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnSummer.setBounds(74, 157, 387, 23);
		panel_4.add(rdbtnSummer);
		
		 
		bg2.add(rdbtnSummer);
		bg2.add(rdbtnSpring);
		bg2.add(rdbtnFall);

		
		bg.add(rdbtnInformationSystemsTechnologyist);
		bg.add(rdbtnInformationSystemsTechnologyist_1);
		bg.add(rdbtnTechnicalResourceManagementtrm);
		bg.add(rdbtnTechnicalResourceManagementtrm_1);
		bg.add(rdbtnElectronicsSystemsTechnologyest_1);
		bg.add(rdbtnElectronicsSystemsTechnologyest);
		
	
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String firstName = ContactInput.getMyValidFirstName(firstNameTextField);
				String lastName = ContactInput.getMyValidLastName(lastNameTextField);;
				String emailAddress = ContactInput.getMyValidEmail(emailTextField);
				String phoneNumber = ContactInput.getMyValidPhone(phoneTextField);
				int program = 0;
				if (rdbtnInformationSystemsTechnologyist.isSelected()){
					 program = 1;
				 }
				 else if (rdbtnInformationSystemsTechnologyist_1.isSelected()){
					 program = 2;
				 }
				 else if (rdbtnTechnicalResourceManagementtrm.isSelected()){
					 program = 3;
				 }
				 else if (rdbtnTechnicalResourceManagementtrm_1.isSelected()){
					 program = 4;
				 }
				 else if (rdbtnElectronicsSystemsTechnologyest.isSelected()){
					 program = 5;
				 }
				 else if (rdbtnElectronicsSystemsTechnologyest_1.isSelected()){
					 program = 6;
				 }

				int semester = 0;
				if (rdbtnFall.isSelected())
					   semester = 1;
				   else if (rdbtnSpring.isSelected())
					   semester = 2;
				   else if (rdbtnSummer.isSelected())
					   semester = 3;
				
				SimpleDateFormat sdf = DateAndTimeInformation.getDateFormat();
				Date currentDate = DateAndTimeInformation.getCurrentDate(sdf);
				String currentTime = DateAndTimeInformation.getCurrentTime(sdf);
				
				
				Contact myContact = new Contact(firstName, lastName, emailAddress, phoneNumber, program, semester, currentDate, currentTime);
			
					InsertContactInformationToDB.insertContactInformationToDB(myContact);
		        	try {
						EmailAutoResponseController.sendEmailAutoResponse(myContact);
					} catch (MessagingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        	SMSAutoResponseController.sendSMSAutoResponse(myContact);
			}
		});
		
		
		btnSubmit.setBounds(52, 47, 89, 23);
		panel_3.add(btnSubmit);
		
		JButton btnResetForm = new JButton("Reset Form");
		btnResetForm.setBounds(52, 81, 89, 23);
		panel_3.add(btnResetForm);
		
	}
}
