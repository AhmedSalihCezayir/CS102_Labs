package shapes;
import java.awt.Graphics;
/**
 * A simple Rectangle class!
 */
public class Rectangle extends SShape
{
   // properties
   int width;
   int length;
   
   // constructors
   public Rectangle( int width, int length) {
      this.width = width;
      this.length = length;
   }
   
   // methods
   public double getArea() {
      return width * length;
   }
   
   public String toString() {
      return "Rectangle with width " + width + " and length " + length 
         + " Center location: " + " ( " + x + "," + y + " )"+ " - Selection: " + isSelected;
   }
   
   public Shape contains( int x, int y) {
      if ( Math.abs(x - getX()) <= length / 2 && Math.abs(y - getY()) <= width)
         return new Rectangle (width, length);
      else
         return null;
   }
   
   public void draw( Graphics g) {}
}