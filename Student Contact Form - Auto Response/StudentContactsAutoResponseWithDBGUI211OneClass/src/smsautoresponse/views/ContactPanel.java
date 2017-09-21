package smsautoresponse.views;

import javax.swing.*;
import java.awt.*;

/**
   The BagelPanel class allows the user to select either
   a white or whole wheat bagel.
*/

public class ContactPanel extends JPanel
{
   // The following constants are used to indicate
   // the cost of each type of bagel.
   private JPanel panel;             // To reference a panel
   private JLabel messageLabel;      // To reference a label
   private JTextField kiloTextField; // To reference a text field
   


   /**
      Constructor
   */

   public ContactPanel()
   {
      // Create a GridLayout manager with 
      // two rows and one column.
      setLayout(new GridLayout(4, 1));

      messageLabel = new JLabel("Enter a distance " +
              "in kilometers");

// Create a text field 10 characters wide.
kiloTextField = new JTextField(10);

panel = new JPanel();

// Add the label, text field, and button
// components to the panel.
panel.add(messageLabel);
panel.add(kiloTextField);
  

      // Add a border around the panel.
      setBorder(BorderFactory.createTitledBorder("Bagel"));

    
   }

   /**
      getBagelCost method
      @return The cost of the selected bagel.
   */

  
}
