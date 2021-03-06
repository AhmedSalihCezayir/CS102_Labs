package shapes;
/**
 * A simple SShape class which is extended version of Shape class!
 */
public abstract class SShape extends Shape implements Selectable, Drawable
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
   
   public abstract Shape contains( int x, int y);

}