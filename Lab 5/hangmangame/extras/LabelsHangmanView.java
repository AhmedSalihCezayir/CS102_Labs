package hangmangame.extras;

import javax.swing.*;
import java.awt.event.*;
import cs102.hangman.*;
import java.awt.*;
/**
 * A simple LabelsHangmanView class!
 */
public class LabelsHangmanView extends JPanel implements IHangmanView 
{
   // properties
   Hangman h;
   JLabel numOfIncorrectTries;
   JLabel knownSoFar;
   JLabel usedLetters;
   JLabel lost;
   
   // constructors
   public LabelsHangmanView( Hangman h) 
   {
      this.h = h;
      
      setBackground( new Color (100, 190, 120));
      
      setLayout( new GridLayout(4,1));
      setPreferredSize( new Dimension(400, 300));
      
      //Labels for showing current status of the game
      numOfIncorrectTries = new JLabel( "Tries left: " + (6 - h.getNumOfIncorrectTries()));
      knownSoFar = new JLabel( "Known So far:  " + h.getKnownSoFar());
      usedLetters = new JLabel( "Used Letters: " + h.getUsedLetters());    
      lost = new JLabel ();
      
      numOfIncorrectTries.setFont(new Font("Monospaced  ", Font.PLAIN, 23));
      knownSoFar.setFont(new Font("Monospaced  ", Font.PLAIN, 23));
      usedLetters.setFont(new Font("Monospaced ", Font.PLAIN, 23));
      lost.setFont(new Font("Monospaced ", Font.PLAIN, 23));
      
      add( numOfIncorrectTries);
      add( knownSoFar);
      add( usedLetters);
      add( lost);
      
   }
   
   // methods 
   //this method will update the labels
   @Override
   public void updateView( Hangman hangmanUpdate) 
   {
      numOfIncorrectTries.setText( "Tries left: " + (6 - hangmanUpdate.getNumOfIncorrectTries()));
      knownSoFar.setText( "Known So far:  " + hangmanUpdate.getKnownSoFar());
      usedLetters.setText( "Used Letters: " + hangmanUpdate.getUsedLetters());
      
      if (hangmanUpdate.hasLost()) 
      {
         lost.setText("You Lost");
      }
      else if (hangmanUpdate.isGameOver() && !hangmanUpdate.hasLost())
      {
         lost.setText("You Win!!");
      }
      else
         lost.setText("");
   }
}