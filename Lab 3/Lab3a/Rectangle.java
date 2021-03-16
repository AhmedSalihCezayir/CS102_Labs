/**
 * A simple Java class!
 */
public class Rectangle extends SShape
{
   // properties
   private int width;
   private int length;
   
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
      return "Rectangle with width " + width + " and length " + length + " - Selection: " + isSelected;
   }
}