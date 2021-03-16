/**
 * A simple Java class!
 */
public abstract class Shape implements Locatable
{
   // properties
   private int x;
   private int y;
   
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