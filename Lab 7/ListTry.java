import java.util.Scanner;

/**
 * Test for List class 
 * @author Ahmed Salih Cezayir
 * @version 12/05/2020
 */ 
public class ListTry
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      final String[] str = {"AAA", "BBB", "CCC", "DDD"}; 
         
      // variables
      List fruits;
      List names;
      List alphabet;
      List newFruits;
      
      // program code
      fruits = new List();
      names = new List();
      alphabet = new List();
      newFruits = new List();
      
      //fruits List
      fruits.addToHead("Pineapple");
      fruits.addToHead("Mango");
      fruits.addToHead("Apple");
      fruits.print();
      System.out.println();      
      
      //names List
      names.addToTail("Ali");
      names.addToTail("Ayse");
      names.addToTail("Mehmet");
      names.addToTail("Ahmet");
      names.print();
      System.out.println();      
      
      //names List removeFromHead()
      names.removeFromHead();
      names.print();
      System.out.println();    
      
      //names List getData()
      System.out.println( "0: " + names.getData(0));
      System.out.println( "1: " + names.getData(1));
      System.out.println();
      
      //names List printReverse
      names.printReverse( names.head);
      System.out.println();
      
      //names List contains()
      System.out.println( "contains: " + names.contains("Ayse"));
      System.out.println( "contains: " + names.contains("Osman"));
      System.out.println();
      
      //names List isOrdered 
      System.out.println( "isOrdered:" + names.isOrdered());
      System.out.println();
      
      //fruits List isOrdered 
      System.out.println( "isOrdered:" + fruits.isOrdered());
      System.out.println();
      
      //alphabet List 
      alphabet.addToTail("A");
      alphabet.addToTail("B");
      alphabet.addToTail("C");
      alphabet.addToTail("D");
      alphabet.addToTail("E");
      alphabet.print();
      
      //alphabet List isOrdered()
      System.out.println( "isOrdered:" + alphabet.isOrdered());
      System.out.println();
      
      alphabet.addToTail("A");
      alphabet.print();
      System.out.println( "isOrdered:" + alphabet.isOrdered());
      System.out.println();
      
      //createFrom(String[] s)
      List.createFrom(str).print();
      System.out.println();
      
      //createFrom(String s)
      List.createFrom("Hello").print();
      System.out.println();
      
      //newFruits List
      newFruits.addToTail("Mango");
      newFruits.addToTail("Kiwi");
      newFruits.addToTail("Strawberry");
      
      System.out.println("Fruits: ");
      fruits.print();
      System.out.println();
      
      System.out.println("newFruits: ");
      newFruits.print();
      System.out.println();
      
      //List merger: fruits + newFruits
      System.out.println("Merge: ");
      List.merger(fruits, newFruits).print();
      
   }
}