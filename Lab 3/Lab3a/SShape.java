/**
 * A simple Java class!
 */
public abstract class SShape extends Shape implements Selectable
{
   // properties
   boolean isSelected;
   
   // constructors
   public SShape() {
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
      return (getX() <= x && getY() <= y); 
   }
}