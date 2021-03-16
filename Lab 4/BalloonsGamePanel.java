import javax.swing.*;
import java.awt.*;
import shapes.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.event.*;

/**
 * A simple BalloonsGamePanel class!
 */
public class BalloonsGamePanel extends JPanel
{
   // properties
   ShapeContainer balloons;
   Timer balloonTimer;
   JLabel scoreLabel;
   int score;
   int elapsedTime;
   MyMouseListener mouseListener;
   GrowListener growListener;
   
   // constructors
   public BalloonsGamePanel() 
   {
      score = 0;
      elapsedTime = 0;
      
      balloons = new ShapeContainer();
      
      scoreLabel = new JLabel("Points: " + score);
      scoreLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
      scoreLabel.setForeground(Color.WHITE);
      
      add(scoreLabel);
      scoreLabel.setVerticalAlignment(JLabel.TOP);
      scoreLabel.setHorizontalAlignment(JLabel.CENTER);
      
      mouseListener = new MyMouseListener();
      growListener = new GrowListener();
      
      addMouseListener( mouseListener);
      
      balloonTimer = new Timer(100, growListener);
      balloonTimer.start();
      
      
      for (int i = 0; i < 25; i++) 
      {
         Random r;
         
         r = new Random();
         
         int x = r.nextInt(750);
         int y = r.nextInt(750);
         
         balloons.add(new Balloon(x,y));
         //repaint();
      }
      setPreferredSize(new Dimension(800,600));
   }
   
   // methods
   public void paintComponent(Graphics g) 
   {
      super.paintComponent(g);
      
      Random r;
      Color randomColor;
      float a ;
      float b;
      float c;
      
      r = new Random();
      a = r.nextFloat();
      b = r.nextFloat();
      c = r.nextFloat();
         
      randomColor = new Color(a, b, c);
      
      g.setColor(randomColor);
      setBackground(Color.BLACK);
      
      Iterator itr = balloons.iterator();
      
      while(itr.hasNext())
      {
         ((Drawable)(itr.next())).draw(g);
      }
   }
   
   public class GrowListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         Iterator itr = balloons.iterator();
         
         while(itr.hasNext())
         {
            ((Balloon)(itr.next())).grow();
         }
         balloons.removeSelected();
         
         if( balloons.size() <= 15) 
         {
            Random r;
            r = new Random();
            
            int x = r.nextInt(750);
            int y = r.nextInt(750);
            
            balloons.add(new Balloon(x,y));
         }
         
         if(elapsedTime >= 150)
         {
            balloonTimer.stop();
            removeMouseListener(mouseListener);
            
            int playAgain = JOptionPane.showConfirmDialog(BalloonsGamePanel.this, "Play again? ", "Game over", 0);
            
            if (playAgain == 0) 
            {
               score = 0;
               elapsedTime = 0;
               balloonTimer.start();
               addMouseListener(mouseListener);
               scoreLabel.setText("Points " + score);
            }
            else if(playAgain == JOptionPane.NO_OPTION)
               System.exit(0);
         }
         elapsedTime++;
         
         repaint();
      }
   }
   
   public class MyMouseListener extends MouseAdapter 
   {
      public void mousePressed(MouseEvent e) 
      {
         score = score + balloons.selectAllAt( e.getX(), e.getY());
         balloons.removeSelected();
         repaint();
         
         scoreLabel.setText("Points: " + score);
      }
   }
}