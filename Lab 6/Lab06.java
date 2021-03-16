import java.util.*;

/**
 * Recursion & recursive methods
 * @author Ahmed Salih Cezayir
 * @version 28.04.2020
 */ 
public class Lab06
{
   static String eqvString = "";
   
   /**Method that counts the number of occurrences of the wanted character in a string
     * @param str String where you want to search your target character
     * @param target Target value
     * @return Number of occurance of the target value in the str
     */
   public static int countTarget(String str, char target) {
      str = str.toLowerCase();
      
      if (str.length() == 0) {
         return 0;
      }
      else if (str.charAt(0) == target) {
         return 1 + countTarget(str.substring(1), target);
      }
      else {
         return countTarget(str.substring(1), target); 
      }
   }
   
   /**Decimal to binary converter method
     * @param decimal Decimal number that you want to convert to binary form
     * @return Binary form of the decimal
     */ 
   public static int binaryEqv( int decimal) {
      if (decimal / 2 == 0) {
         eqvString = decimal % 2 + eqvString;
      }
      else {
         eqvString = decimal % 2 + eqvString;
         
         if (decimal % 2 == 0) {
            binaryEqv( decimal / 2); 
         }
         else {
            binaryEqv( (decimal - 1) / 2); 
         }
      }
      return Integer.parseInt( eqvString);
   }
   
   /**Method that determines whether strings in an arrayList are lexicographic or not
   @param stringList ArrayList which you want to know wheter it is ordered or not
   @param n Number of values in the stringList
   @return If arrayList is Sorted returns true
   */ 
   public static boolean isSorted( ArrayList<String> stringList, int n) {
      
      if (n == 0 || n == 1) {
         return true;
      }
      if (stringList.get( n - 1).compareTo( stringList.get( n - 2)) < 0) {
         return false;
      }
      
      return isSorted(stringList, n - 1);
   }
   
   /**Method for checking whether a given number is even and its digits are in an increasing order 
     * @param number Numbers that you want to check whether they meet the requirements
     * @return If number meets the requirements return true
     */ 
   public static boolean isRightNumber( int number) {
      String numberString;
      numberString = number + "";
      
      //Check whether number is even or not
      if (Integer.parseInt( "" + numberString.charAt( numberString.length() - 1)) % 2 != 0) {
         return false;
      }
      if (numberString.length() == 1) {
         return true;
      }
      else
      {
         //compare first and second characters of the String
         if (Integer.parseInt( numberString.substring( 0, 1)) >= Integer.parseInt( numberString.substring( 1, 2)))
         {
            return false;
         }
         numberString = numberString.substring(1);   
         return isRightNumber( Integer.parseInt(numberString));
      }
   }
   
   /**Method that prints numbers which are even and its digits are in an increasing order
     * @param n Digit numbers of the numbers which will be printed
     * @param number Starting number 
     */
   public static void printRightNumbers( int n, int number) { 
      if ( number < Math.pow( 10, n) - 1) {
         if (isRightNumber( number)) {
            System.out.print( number + " ");
         }
         printRightNumbers(n, number + 2);
      }
   }
   
   public static void main( String[] args)
   {

      // constants
      final String name = "AhmedSalihCezayir";
      final int number = 99;
      
      // variables
      ArrayList<String> list;
      
      // program code  
      System.out.println( name + " how many a's: " + countTarget(name, 'a')); 
      System.out.println();
      
      System.out.println( number + " == " + binaryEqv(number));
      System.out.println();
      
      list = new ArrayList<String>();
      
      list.add("Aa");
      list.add("Bb");
      list.add("Cc");
      list.add("Dd");
      list.add("Ee");
      list.add("Gg");  
      
      System.out.println( list);
      System.out.println("isSorted: " + isSorted(list, list.size()));
      System.out.println();
      
      printRightNumbers(3, 0);
   }

}