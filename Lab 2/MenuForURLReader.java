import cs1.SimpleURLReader;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *  
 * @author Ahmed Salih Cezayir
 * @version 03.03.2020
 */ 
public class MenuForURLReader
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      int selection;
      ArrayList collection;
      boolean isQuit;
      String url;
      MySimpleURLReader reader;
      XHTMLFilteredReader xHtmlReader;
      
      // program code
      collection = new ArrayList();
      isQuit = false;
      
      System.out.println( "Welcome!");
      do {
         System.out.println( "Please select an operation");
         System.out.println( "1- Enter the url of the poem to add to collection");
         System.out.println( "2- List all poems in the collection");
         System.out.println( "3- QUIT");
         System.out.println( "--------------------------------------------");
         selection = scan.nextInt();
         if (selection == 1) {
            System.out.println( "Please enter the url");
            url = scan.nextLine();
            
            if (url.charAt(url.length() - 1) == 't') {
               reader = new MySimpleURLReader( url);
               collection.add( reader);
            }
            else {
               xHtmlReader = new XHTMLFilteredReader( url);
               collection.add( xHtmlReader);
            }  
         }
         else if (selection == 2) {
            do {
               for (int i = 0; i < collection.size(); i++) {
                  System.out.print( (i + 1) + " - " + (collection.get(i)).getName() + "\n");
               }
               
               System.out.println( "Please enter the index number of the poem you want to see");
               selection = scan.nextInt();
               System.out.println( collection.get(selection - 1).getPageContents());
               System.out.println("To go to main menu type " + collection.size());
            } while (selection == collection.size());
         }
         else if (selection == 3) {
            isQuit = !isQuit;
         }   
      } while (!isQuit);
   }
}