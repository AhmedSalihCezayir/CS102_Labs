/**
 * A simple Java class!
 */
public class Square extends Rectangle
{
   // properties
   private int side;
   
   // constructors
   public Square( int side) {
      super(side, side);
   }
   
   // methods
   public String toString() {
      return "Square with sides " + side;
   }
}