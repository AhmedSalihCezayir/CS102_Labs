import cs1.SimpleURLReader;
import java.util.Scanner;

/**
 * SimpleURLReader class test 
 * @author Ahmed Salih Cezayir
 * @version 03.03.2020
 */ 
public class Lab02a
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner( System.in);
        
        // constants
        
        // variables
        SimpleURLReader reader;
        MySimpleURLReader myReader;
        HTMLFilteredReader htmlReader;
        XHTMLFilteredReader xHtmlReader;
        
        // program code
//        reader = new SimpleURLReader( "http://www.cs.bilkent.edu.tr/~david/housman.txt");
//        System.out.println( reader.getPageContents());
//        System.out.println( reader.getLineCount());
//        
//        myReader = new MySimpleURLReader( "http://www.cs.bilkent.edu.tr/~david/housman.txt");
//        System.out.println( myReader.getURL());
//        System.out.println( myReader.getName());
//        System.out.println("------------------------------------");
//        System.out.println( myReader.getPageContents());
//        
//        System.out.println("------------------------------------");
//        htmlReader = new HTMLFilteredReader("http://www.cs.bilkent.edu.tr/~david/housman.htm");
//        System.out.println(htmlReader.getUnfilteredPageContents());
        
        xHtmlReader = new XHTMLFilteredReader("http://www.cs.bilkent.edu.tr/~david/index.html");
        System.out.println(xHtmlReader.getLinks());
//        System.out.println(xHtmlReader.getPageContents());
    }
    
}