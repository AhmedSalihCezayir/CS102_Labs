import java.util.Scanner;

/**
 * Producing first 100 prime numbers using IntBag class
 * @author Ahmed Salih Cezayir
 * @version 18.02.2019
 */ 
public class PrimeNumbers
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      IntBag primeNumbers;
      int notPrime;
      
      // program code
      primeNumbers = new IntBag();
      notPrime = 0;
      
      primeNumbers.add(2);
      //This outer loop is for deciding whether a number is prime
      for (int i = 3; primeNumbers.size() < 100; i++) {
         //This loops gives prime numbers which is in the primeNumbers
         for (int k = 0; k < primeNumbers.size(); k++) {   
           //To check whether number i is divisible and not a prime number  
           if (i % primeNumbers.get(k) == 0) 
               notPrime++;
         }
         //if it is a prime number notPrime will be 0 and if will add it to IntBag
         if (notPrime == 0)
            primeNumbers.add(i); 
         notPrime = 0;
      }
      System.out.println(primeNumbers.toString());
   }
}