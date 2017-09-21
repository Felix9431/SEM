package smsautoresponse.views;

import javax.swing.*;
import java.awt.*;

/**
   The CoffeePanel class allows the user to select coffee.
*/

public class SemesterYearPanel extends JPanel
{
   // The following constants are used to indicate
   // the cost of coffee.
	 public final String fall2017 = "Fall 2017";
	 public final String spring2018 = "Spring 2018";
	 public final String summer2018 = "Summer 2018";

	 private static JRadioButton fall2017Button;     
	 private static JRadioButton spring2018Button; 
	 private static JRadioButton summer2018Button;  
   private ButtonGroup bg;             // Radio button group

   /**
      Constructor
   */

   public SemesterYearPanel()
   {
      // Create a GridLayout manager with 
      // four rows and one column.
      setLayout(new GridLayout(3, 1));

      // Create the radio buttons.
      fall2017Button = new JRadioButton(fall2017, true);
      spring2018Button = new JRadioButton(spring2018);
      summer2018Button = new JRadioButton(summer2018);

      // Group the radio buttons.
      bg = new ButtonGroup();
      bg.add(fall2017Button);
      bg.add(spring2018Button);
      bg.add(summer2018Button);

      // Add a border around the panel.
      setBorder(BorderFactory.createTitledBorder("When do you want to start school?"));

      // Add the radio buttons to the panel.
      add(fall2017Button);
      add(spring2018Button);
      add(summer2018Button);
   }

   public static int getSemesterYear(){
	   int semesterYear = 0;
		 
	   if (fall2017Button.isSelected())
		   semesterYear = 1;
	   else if (spring2018Button.isSelected())
		   semesterYear = 2;
	   else if (summer2018Button.isSelected())
		   semesterYear = 3;

	   return semesterYear;
   }
}
