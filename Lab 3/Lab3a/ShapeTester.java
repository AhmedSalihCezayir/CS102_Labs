import java.util.Scanner;
/**
 * A simple Java class!
 */
public class ShapeTester
{
   // properties
   ShapeContainer container;
   
   // constructors
   public ShapeTester() {
      container = new ShapeContainer();
   }
   
   // methods
   public void menu() {
   Scanner scan;
   int selection;
   String shapeName;
   SShape shape;
   int radius;
   int side1;
   int side2;
   boolean isQuit;
   int x;
   int y;
   
   scan = new Scanner( System.in);
   isQuit = false;
   shape = null;
   
   do {
      System.out.println("Please select an operation");
      System.out.println("1- Create an empty set of shapes");
      System.out.println("2- Add rectangle or circle to the set");
      System.out.println("3- Print out the total surface area of the entire set of shapes");
      System.out.println("4- Information about the shapes in the container");
      System.out.println("5- Exit");
      
      selection = scan.nextInt();
      if (selection == 1) {
         container = new ShapeContainer();
      }
      else if (selection == 2) {
         System.out.println( "What do you want to add( Rectangle / Circle)");
         shapeName = scan.next();
         
         if (shapeName.toLowerCase().equals( "circle")) {
            System.out.println( "Please enter raius");
            radius = scan.nextInt();
            shape = new Circle( radius);
            System.out.println("Please enter the x and y locations");
            x = scan.nextInt();
            y = scan.nextInt();
            shape.setLocation(x, y);
         }
         else if (shapeName.toLowerCase().equals( "rectangle")) {
            System.out.println( "Please enter length and width");
            side1 = scan.nextInt();
            side2 = scan.nextInt();
            shape = new Rectangle( side1, side2);
            System.out.println("Please enter the x and y locations");
            x = scan.nextInt();
            y = scan.nextInt();
            shape.setLocation(x, y);
         }
         container.add (shape);
      }
      else if (selection == 3) {
         System.out.println( container.getArea());
      }
      else if (selection == 4) {
         System.out.println(container.toString());
      }
      else if (selection == 5) {
         isQuit = true;
      }
   }while (!isQuit);
   
   }
}