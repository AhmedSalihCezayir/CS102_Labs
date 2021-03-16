/**
 * A simple Java class!
 */
public class Circle extends SShape
{
   // properties
   private int radius;

   // constructors
   public Circle( int radius) {
      this.radius = radius;
   }
   
   // methods
   public double getArea() {
      return 3.1415 * radius * radius;
   }
   
   public String toString() {
      return "Circle with radius " + radius + " - Selection: " + isSelected;
   }
   
}