package shapes;
import java.awt.Graphics;
/**
 * A simple Circle class!
 */
public class Circle extends SShape
{
   // properties
   int radius;
   
   // constructors
   public Circle( int radius) {
      this.radius = radius;
   }
   
   // methods
   public double getArea() {
      return 3.1415 * radius * radius;
   }
   
   public String toString() {
      return "Circle with radius " + radius + " Center location: " + " ( " + x + "," + y + " )" + " - Selection: " + isSelected;
   }
   
   public Shape contains( int x, int y) {
      if (((x - getX()) * (x - getX()) + (y - getY()) * (y - getY())) <= radius * radius)
         return new Circle ( radius);
      else 
         return null;
   }
   
   public void draw( Graphics g) {
      g.drawOval(getX() - getRadius(), getY() - getRadius() , getRadius() * 2, getRadius() * 2);
   }
   
   public void setRadius(int radius)
   {
      this.radius = radius;
   }
   
   public int getRadius() 
   {
      return radius;
   }
   
}