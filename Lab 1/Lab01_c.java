import java.util.Scanner;

/**
 * Managing collections of numbers using IntBag class 
 * @author Ahmed Salih Cezayir
 * @version 18.02.2020
 */ 
public class Lab01_c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      IntBag collection;
      int selection;
      int capacity;
      int values;
      int index;
      int testValue;
      int[] locations;
      boolean quit;
      int counter;
      
      // program code
      counter = 0;
      capacity = 100;
      testValue = -1;
      quit = false;
      collection = new IntBag();
      locations = new int[1];

      System.out.println( "Welcome to Bags of Integer!");
      do {
         System.out.println( "Please select an operation number!");
         System.out.println( "-----------------------------------");
         System.out.println( "1 - Create a new empty collection"); 
         System.out.println( "2 - Enter positive values (to stop enter -1) ");
         System.out.println( "3 - See the collection of values");
         System.out.println( "4 - Add a value to the collection of values at a specified location");
         System.out.println( "5 - Remove the value at a specified location from the collection of values");
         System.out.println( "6 - Read a single test value");
         System.out.println("Current test value: " + testValue);
         System.out.println( "7 - Compute the set of locations of the test value within the collection");
         System.out.println( "8 - Print the set of locations");
         System.out.println( "9 - QUIT");
         
         selection = scan.nextInt();
         if (selection == 1) {
            System.out.println( "Please enter max capacity ");
            capacity = scan.nextInt();           
            collection = new IntBag(capacity);
            counter = 0;
         }
         else if (selection == 2) {
            System.out.println( "Please enter positive values (-1 to stop)");
            values = scan.nextInt();
            counter++;

            while (values >= 0 && capacity > counter) {
               collection.add( values);
               values = scan.nextInt();
               counter++;

               if (capacity == counter) {
                  System.out.println("Capacity is full!");
               }
            }
         }
         else if (selection == 3) {
            System.out.println( "--------------");
            System.out.println( collection.toString());
            System.out.println( "--------------");  
         }
         else if (selection == 4) {
            System.out.println( "Please enter the value you want to add and its index");
            values = scan.nextInt();
            index = scan.nextInt();
            collection.add( values, index);
         }
         else if (selection == 5) {
            System.out.println( "Please enter the index of the value you want to delete");
            index = scan.nextInt();
            collection.remove( index);
         }
         else if (selection == 6) {
            System.out.println("Please enter a test value");
            testValue = scan.nextInt(); 
         }
         else if (selection == 7) {
            locations = new int[collection.size()];
            locations = collection.findAll( testValue);
         }
         else if (selection == 8) {
           System.out.println("Location indexes of testValue is: ");
           for (int i = 0; i < locations.length; i++) {
             if ( locations[i] != -1)
               System.out.println( locations[i]);
           }
           System.out.println();
         }
         else if (selection == 9) {
            quit = true;
         }
      } while (!quit);  
   }
}