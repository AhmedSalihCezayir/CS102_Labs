package hangmangame.extras;

import javax.swing.*;
import cs102.hangman.*;
import java.awt.*;

/**
 * A simple GallowsHangmanView class!
 */
public class GallowsHangmanView extends JPanel implements IHangmanView 
{
   // properties
   HangmanModel hangmanModel;
   
   // constructors
      public GallowsHangmanView ()
   {
      setBackground(new Color(100, 190, 120));
      setLayout(new BorderLayout());
   }
   
   // methods
   public void paintComponent( Graphics g) 
   {
      super.paintComponent(g);
      
      g.setColor(Color.BLACK);
      
      //bottom stick
      g.fillRect(30, 450, 150, 20); 
      //tall left stick
      g.fillRect(60, 230, 20, 230); 
      //top stick
      g.fillRect(60, 230, 100, 20);
      //hanging stick
      g.fillRect(150, 230, 10, 60); 
      
      
      //The Head
      if( hangmanModel.getNumOfIncorrectTries() > 0) 
      {
         g.drawOval(135, 290, 40, 40);
      }
      
      //The body
      if(hangmanModel.getNumOfIncorrectTries() > 1) 
      {
         g.drawLine(155,330,155,395);
      }
      
      //The Right Leg
      if(hangmanModel.getNumOfIncorrectTries() > 2) 
      {
         g.drawLine(155,395,120,420);
      }
      
      //The left leg
      if(hangmanModel.getNumOfIncorrectTries() > 3) 
      {
         g.drawLine(155,395,190,420);
      }
      
      //The right hand
      if(hangmanModel.getNumOfIncorrectTries() > 4) 
      {
         g.drawLine(155,350,180,370);
      }
      
      //The left hand
      if(hangmanModel.getNumOfIncorrectTries() > 5) 
      {
         g.drawLine(155,350,130,370);
      }
   }
   
   @Override
   public void updateView( Hangman h) 
   {
      hangmanModel = (HangmanModel)h;
      repaint();
   }
}