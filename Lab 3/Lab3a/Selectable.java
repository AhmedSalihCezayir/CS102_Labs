public interface Selectable {
   boolean getSelected();
   void setSelected( boolean selection);
   boolean shapeContains( int x, int y);
}