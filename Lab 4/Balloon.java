import shapes.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * A simple Balloon class!
 */
public class Balloon extends Circle implements Drawable 
{
   // properties
   int radius;
   
   // constructors
   public Balloon(int x, int y) 
   {
      super(25);
      setLocation(x, y);
   }
   
   // methods
   public void grow() 
   {
      setRadius(getRadius() + 1);
      
      if (getRadius() >= 100) 
      {
         setSelected(true);
         setRadius(0);
      }
   }
}