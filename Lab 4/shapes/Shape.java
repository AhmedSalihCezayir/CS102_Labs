package shapes;
/**
 * A simple Shape class!
 */
public abstract class Shape implements Locatable
{
   // properties
   int x;
   int y;
   
   // constructors

   // methods
   public abstract double getArea();
   
   public void setLocation( int x, int y) {
      this.x = x;
      this.y = y;
   }
   
   public int getX() {
      return x;
   }
   
   public int getY() {
      return y;
   }
}