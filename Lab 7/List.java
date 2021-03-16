/**
 * Basic List class
 * @author Ahmed Salih Cezayir
 * @version 12/05/2020
 */ 
public class List
{
   // properties
   Node head;
   
   // constructors
   public List() {
      head = null;
   }
   
   // methods
   public void addToHead( String item) {
      Node nextElement;
      nextElement = new Node( item, head);
      
      if (!isEmpty()) {
         head = nextElement; 
      }
      else {
         head = new Node( item, null);
      }
   }
   
   public void addToTail(String item) {
      if (head == null) {
         Node tmp = new Node(item, null);
         head = tmp;
      }
      else {
         Node current = tail();
         Node tail = new Node(item, null);
         current.next = tail;
      }
      
   }
   
   public String removeFromHead() {
      Node tmp = head;
      if (tmp == null) {
         return null;
      }
      head = head.next;
      return tmp.data;
   }
   
   public boolean isEmpty() {
      if (head == null) 
         return true;
      else
         return false;
   }
   
   public String getData( int index) {
      Node current;
      int count;
      
      current = head;
      count = 0;
      
      while (current != null) {
         if (count == index) {
            return current.data;
         }
         else {
            current = current.next;
         }
         count++;
      }
      return null;
   }
   
   public void print() {
      if (isEmpty()) {
         System.out.println("List is empty");
      }
      else {
         Node current;
         current = head;
         while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
         }
      }
   }
   
   public void printReverse( Node head) {
      if ( head != null) {
         if ( head.next != null)
            printReverse( head.next);
         System.out.println( head.data);
      }
      else
         System.out.println( "List is empty!");
   }
   
   public boolean contains( String target) {
      Node current;
      current = head;
      
      while (current != null) {
         if( (current.data).equals(target)) {
            return true;
         }
         current = current.next;
      }
      return false;
   }
   
   public boolean isOrdered() {
      Node current;
      int ordered;
      
      current = head;
      ordered = 0;
      
      if (head == null) {
         return true;
      }
      
      if (head.next == null){
         return true;
      }  
      
      while (current != null && current.next != null && ordered == 0) { 
         if ((current.data).compareTo((current.next).data) < 0){ 
            current = current.next; 
         }   
         else 
            ordered++;
      }
      return ordered == 0;
   }
   
   private Node next(Node n) {
      if (n.next != null) {
         return n.next;
      }
      else {
         return null;
      }
   }
   
   private Node previous(Node n) {
      Node current;
      current = head;
      
      if (isEmpty()) {
         return null;
      }
      
      while (current.next != null) {
         if (((current.next).data).equals(n.data)) {
            return current;
         }
         current = current.next;
      }      
      return null;
   }
   
   private Node tail() {
      Node current;
      current = head;
      
      while (current.next != null) {
         current = current.next;
      }
      
      return current;
   }
   
   public String toString() {
      String list;
      Node tmp;
      
      list = "";
      tmp = head;
      
      while (tmp != null) {
         list = list + tmp.data + " ";
         tmp = tmp.next;
      }
      return list;
   }
   
   public static List createFrom( String[] strings) {
      List list;
      list = new List();
      
      for (String s: strings) {
         list.addToTail(s);
      }
      return list;
   }
   
   public static List createFrom( String str) { 
      List list;
      list = new List();
      int size;
      size = str.length();
      
      for (int i = 0; i < size; i++) {
         list.addToTail(str.charAt(i) + "");
      }
      return list;
   }
   
   public static List merger( List a, List b) {
      List list;
      list = new List();
      Node tmp;
      tmp = a.head;
      
      while (tmp != null) {
         if (!b.contains( tmp.data)) {
            list.addToTail(tmp.data);
         }
         tmp = tmp.next;
      } 
      
      tmp = b.head;
      while (tmp != null) {
         if (!a.contains( tmp.data)) {
            list.addToTail(tmp.data);
         }
         tmp = tmp.next;
      }
      return list;
   }
   
   //----------Node inner class --------------
   private class Node {
      String data;
      Node next;
      
      public Node( String data, Node next) {
         this.data = data;
         this.next = next;
      }
   }
}

