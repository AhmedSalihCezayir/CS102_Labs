package hangmangame.extras;

import cs102.hangman.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A simple HangmanLetterButtonsListener class!
 */ 

public class HangmanLetterButtonsListener implements ActionListener
{
   //properties
   HangmanModel model;
   int notTrue;
   
   //constructor
   public HangmanLetterButtonsListener( HangmanModel model)
   {
      this.model = model;
      notTrue = 1;
   }
   
   //methods

   //disables buttons & changes colors
   public void actionPerformed(ActionEvent e)
   {
      model.tryThis(e.getActionCommand().charAt(0));
      
      ((JButton)e.getSource()).setEnabled(false);
      
      if(notTrue == model.getNumOfIncorrectTries())
      {
        ((JButton)e.getSource()).setBackground(Color.RED);
        
        notTrue++;
      }
      else 
      {
         ((JButton)e.getSource()).setBackground(Color.GREEN);
      }
      
      if(model.isGameOver())
      {
         notTrue = 1;
      }
      
   }
}