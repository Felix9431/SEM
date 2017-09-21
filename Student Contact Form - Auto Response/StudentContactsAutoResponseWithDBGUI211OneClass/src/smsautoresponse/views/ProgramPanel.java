package smsautoresponse.views;

import javax.swing.*;
import java.awt.*;

/**
   The CoffeePanel class allows the user to select coffee.
*/

public class ProgramPanel extends JPanel
{
   // The following constants are used to indicate
   // the cost of coffee.
   public final String ISTOnlineProgram = "IST Online Program";
   public final String ISTOnCampusProgram = "IST On-Campus Program";
   public final String TRMOnlineProgram = "TRM Online Program";
   public final String TRMOnCampusProgram = "TRM On-Campus Program";
   public final String ESTOnlineProgram = "EST Online Program";
   public final String ESTOnCampusProgram = "EST On-Campus Program";
  
   private static JRadioButton ISTOnlineProgramButton;     
   private static JRadioButton ISTOnCampusProgramButton; 
   private static JRadioButton TRMOnlineProgramButton;   
   private static JRadioButton TRMOnCampusProgramButton; 
   private static JRadioButton ESTOnlineProgramButton;   
   private static JRadioButton ESTOnCampusProgramButton; 
   private ButtonGroup bg; 

   /**
      Constructor
   */

   public ProgramPanel()
   {
      // Create a GridLayout manager with 
      // four rows and one column.
      setLayout(new GridLayout(6, 1));

      // Create the radio buttons.
      ISTOnlineProgramButton = new JRadioButton(ISTOnlineProgram, true);
      ISTOnCampusProgramButton = new JRadioButton(ISTOnCampusProgram);
      TRMOnlineProgramButton = new JRadioButton(TRMOnlineProgram);
      TRMOnCampusProgramButton = new JRadioButton(TRMOnCampusProgram);
      ESTOnlineProgramButton = new JRadioButton(ESTOnlineProgram);
      ESTOnCampusProgramButton = new JRadioButton(ESTOnCampusProgram);      

      // Group the radio buttons.
      bg = new ButtonGroup();
      bg.add(ISTOnlineProgramButton);
      bg.add(ISTOnCampusProgramButton);
      bg.add(TRMOnlineProgramButton);
      bg.add(TRMOnCampusProgramButton);
      bg.add(ESTOnlineProgramButton);
      bg.add(ESTOnCampusProgramButton);

      // Add a border around the panel.
      setBorder(BorderFactory.createTitledBorder("Program Information"));

      // Add the radio buttons to the panel.
      add(ISTOnlineProgramButton);
      add(ISTOnCampusProgramButton);
      add(TRMOnlineProgramButton);
      add(TRMOnCampusProgramButton);
      add(ESTOnlineProgramButton);
      add(ESTOnCampusProgramButton);
   }
   
   public static int getProgram(){
		 int program = 0;
		 
		 if (ISTOnlineProgramButton.isSelected()){
			 program = 1;
		 }
		 else if (ISTOnCampusProgramButton.isSelected()){
			 program = 2;
		 }
		 else if (TRMOnlineProgramButton.isSelected()){
			 program = 3;
		 }
		 else if (TRMOnCampusProgramButton.isSelected()){
			 program = 4;
		 }
		 else if (ESTOnlineProgramButton.isSelected()){
			 program = 5;
		 }
		 else if (ESTOnCampusProgramButton.isSelected()){
			 program = 6;
		 }
		return program; 
	 }
}
