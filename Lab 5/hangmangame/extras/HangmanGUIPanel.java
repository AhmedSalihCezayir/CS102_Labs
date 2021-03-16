package hangmangame.extras;

import cs102.hangman.HangmanModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 * Collection of UI components to form a complete Hangman game. 
 * View components implement IHangmanView, so they can automatically update
 * whenever the hangmanModel associated with changes, changes.
 * Other components are hangman controllers that update the model.
 * @author Ahmed Salih Cezayir
 */
public class HangmanGUIPanel extends JPanel {

   HangmanModel hm;
   TextFieldControlPanel textFPanel;
   NewGameButtonControl newGameButton;
   LabelsHangmanView hangmanView;
   GallowsHangmanView gallowsHangmanView; 
   HangmanLetterButtonControls letters;
   
   public HangmanGUIPanel( HangmanModel hm) 
   {
      this.hm = hm;
      setPreferredSize( new Dimension( 1000, 1000) );
      setLayout( new BorderLayout() );
      setBackground( Color.YELLOW);

      textFPanel = new TextFieldControlPanel( hm);
      add( textFPanel, BorderLayout.NORTH);
      
      newGameButton = new NewGameButtonControl( hm);
      add( newGameButton, BorderLayout.SOUTH);
      
      hangmanView = new LabelsHangmanView( hm);
      add( hangmanView, BorderLayout.WEST);
      
      gallowsHangmanView = new GallowsHangmanView();
      add( gallowsHangmanView, BorderLayout.CENTER);
      
      hm.addView( hangmanView);
      hm.addView( gallowsHangmanView); 
      hm.addView( newGameButton); 
      
      letters = new HangmanLetterButtonControls( hm.getAllLetters());
      letters.addActionListener( new HangmanLetterButtonsListener(hm));
      
      hm.addView( letters);
      add( letters, BorderLayout.EAST); 
   }
   
}
