package shapes;
public interface Selectable {
   boolean getSelected();
   void setSelected( boolean selection);
   Shape contains( int x, int y);
}