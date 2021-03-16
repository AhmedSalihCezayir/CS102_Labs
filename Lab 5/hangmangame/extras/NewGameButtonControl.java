package hangmangame.extras;

import javax.swing.*;
import java.awt.event.*;
import cs102.hangman.*;

/**
 * A simple NewGameButtonControl class!
 */
public class NewGameButtonControl extends JButton implements ActionListener, IHangmanView
{
   // properties
   HangmanModel model;
   
   // constructors
   public NewGameButtonControl(HangmanModel model) 
   {
      super("New Game");
      this.model = model;
      
      setEnabled(false);
      
      addActionListener(this);
   }
   
   // methods
   //Starts a new game
   public void actionPerformed(ActionEvent e) 
   {
      model.initNewGame();
      setEnabled(false);
   }
   
   //When game is over button become enabled
   @Override
   public void updateView( Hangman hangman)
   {  
      if ( model.isGameOver())
      {
         setEnabled(true);
      }
  }
}