package hangmangame.extras;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import cs102.hangman.Hangman;

/**
 * A simple TextFieldControlPanel class!
 */
public class TextFieldControlPanel extends JPanel implements ActionListener
{
   // properties
   Hangman hangman;
   JTextField textField;
   JLabel label;
   
   // constructors
   public TextFieldControlPanel( Hangman h) 
   {
      hangman = h;
      textField = new JTextField(15); 
      label = new JLabel("Please enter letter guess: ");
      label.setFont(new Font("Dialog", Font.BOLD, 23));
      
      add( label);
      add(textField);
      
      textField.addActionListener(this);
   }
   
   // methods
   //Tries all the letters entered to text field
   public void actionPerformed(ActionEvent e) 
   {
      for (int i = 0; i < (textField.getText()).length(); i++)
      {
         hangman.tryThis(( textField.getText()).charAt(i));
      }
      
      textField.setText("");
   }
}