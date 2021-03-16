import java.util.ArrayList;
/**
 * A simple Java class!
 */
public class ShapeContainer
{
   // properties
   private ArrayList<Shape> container;
   
   // constructors 
   public ShapeContainer() {
      container = new ArrayList<Shape>();
   }
   
   // methods
   public void add( Shape s) {
      container.add( s);
   }
   
   public double getArea() {
      double area;
      area = 0;
      for (Shape shapes: container) {
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
}