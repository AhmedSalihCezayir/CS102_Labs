package shapes;
import java.util.*;
/**
 * A simple ShapeContainer class!
 */
public class ShapeContainer implements Iterable
{
   // properties
   ArrayList<SShape> container;
   
   // constructors 
   public ShapeContainer() {
      container = new ArrayList<SShape>();
   }
   
   // methods
   public void add( SShape s) {
      container.add( s);
   }
   
   public double getArea() {
      double area;
      area = 0;
      for (SShape shapes: container) {
         area = area + shapes.getArea();
      }
      return area;
   }
   
   public String toString() {
      String str;
      str = "";
      for (int i = 0; i < container.size(); i++) {
         str = str + (i + 1) + "- " + (container.get(i)).toString() + "\n";
      }
      return str;
   }
   
   public Shape findShape( int x, int y) {
      for (SShape shapes: container) {
         if (shapes.contains(x, y) != null){
            shapes.setSelected(true);
            return shapes;
         }
      }
      return null;
   }
   
   public void removeSelected() {
      for ( int i = 0; i < container.size(); i++) {
         if (container.get(i).getSelected()){
            container.remove(i);
         }
      }
   }
   
   public Iterator<SShape> iterator() {
      return this.container.iterator();
   }
   
   public int size() {
      return container.size();
   }
   
   public int selectAllAt(int x, int y) {
      int counter;
      counter = 0;
      for (int i = 0; i < size(); i++) {
         if ((container.get(i)).contains(x, y) != null) {
            (container.get(i)).setSelected(true);
            counter++;
         }
      }
      return counter;
   }
}