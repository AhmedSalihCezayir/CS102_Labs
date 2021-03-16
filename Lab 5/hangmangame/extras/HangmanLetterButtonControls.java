package hangmangame.extras;

import cs102.hangman.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A simple HangmanLetterButtonControls class!
 */
public class HangmanLetterButtonControls extends LetterButtonControls implements IHangmanView
{
   // properties

   // constructors
   public HangmanLetterButtonControls (String letters)
   {
      super(letters);
   }
   
   // methods
   @Override
   public void updateView(Hangman hangman)
   {
      setEnabledAll(true);
      setButtonColor(true);
      setDisabled( hangman.getUsedLetters());
      
      if( hangman.isGameOver())
      {
         setEnabledAll(false); 
      } 
   }
}