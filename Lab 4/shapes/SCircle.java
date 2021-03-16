package shapes;
/**
 * A simple Java class!
 */
public abstract class SCircle extends Circle implements Selectable
{
   // properties
   boolean isSelected;
   
   // constructors
   public SCircle( int radius) {
      super( radius);
      isSelected = false;
   }
   
   // methods
   public boolean getSelected() {
      return isSelected;
   }
   
   public void setSelected( boolean selection) {
      isSelected = true;
   }
   
   public boolean shapeContains( int x, int y) {
      return ((x - getX()) * (x - getX()) - (y - getY()) * (y - getY())) <= radius * radius;
   }
}