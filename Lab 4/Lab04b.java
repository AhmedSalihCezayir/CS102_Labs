import java.util.Scanner;
import javax.swing.*;

/**
 * Balloons Game
 * @author Ahmed Salih Cezayir
 * @version 07.04.2020
 */ 
public class Lab04b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      JFrame frame;
      BalloonsGamePanel game;
      
      // program code
      frame = new JFrame("Balloons Game");
      game = new BalloonsGamePanel();
      
      frame.setSize(1000,1000);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(game);
   }

}