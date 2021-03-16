import java.util.Scanner;
import java.util.Iterator;

/**
 * __program description___ 
 * @author __your name___
 * @version __date__
 */ 
public class TestIterators
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      Iterator i; 
      Iterator j;
      IntBag bag;
      
      // program code
      bag = new IntBag();
      bag.add(1);
      bag.add(2);
      bag.add(3);
      bag.add(4);
      bag.add(5);
      
      i = bag.iterator();
      
      while ( i.hasNext() ) 
      {
         System.out.println( i.next() );

         j = bag.iterator();
         
         while ( j.hasNext() )
         {
            System.out.println( "--" + j.next() );
         }
      }
      
   }

}