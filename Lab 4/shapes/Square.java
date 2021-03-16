package shapes;
/**
 * A simple Square class!
 */
public class Square extends Rectangle
{
   // properties
   int side;
   
   // constructors
   public Square( int side) {
      super(side, side);
   }
   
   // methods
   public String toString() {
      return "Square with sides " + side + " - Selection: " + isSelected;
   }
}