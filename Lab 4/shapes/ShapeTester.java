package shapes;
import java.util.Scanner;
/**
 * Menu for managing circles and rectangles
 * @author Ahmed Salih Cezayir
 * @version 10.03.2020
 */ 

public class ShapeTester
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      int selection;
      int radius;
      int side1;
      int side2;
      int x;
      int y;
      boolean isQuit;
      String shapeName;
      SShape shape;
      ShapeContainer container;
      
      // program co,de
      isQuit = false;
      shape = null;
      container = new ShapeContainer();
      
      do {
         System.out.println("Please select an operation");
         System.out.println("1- Create an empty set of shapes");
         System.out.println("2- Add rectangle or circle to the set");
         System.out.println("3- Print out the total surface area of the entire set of shapes");
         System.out.println("4- Information about the shapes in the container");
         System.out.println("5- Find the first shape that contains a location (x,y)");
         System.out.println("6- Removes all selected shapes from the set of shapes");
         System.out.println("7- Exit");
         
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
            if (container.getArea() != 0)
               System.out.println(container.toString());
            else
               System.out.println("Set of shapes is empty");
         }
         else if (selection == 5) {
            System.out.println("Please enter locations (x,y)");
            x = scan.nextInt();
            y = scan.nextInt();
            if (container.findShape(x, y) != null)
               System.out.println( container.findShape(x, y).toString());
            else
               System.out.println("No shape includes that location");
         }
         else if (selection == 6) {
            container.removeSelected();
         }      
         else if (selection == 7) {
            isQuit = true;
         }
      }while (!isQuit);
   }
   
}