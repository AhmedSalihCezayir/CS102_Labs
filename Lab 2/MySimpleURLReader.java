import cs1.SimpleURLReader;
/**
 * A simple Java class!
 */
public class MySimpleURLReader extends SimpleURLReader 
{
   // properties
   String url;
   
   // constructors
   public MySimpleURLReader( String add) {
      super( add);
      url = add;
   }
   
   // methods
   public String getURL() {
      return url;
   }
   
   public String getName() {
      int counter;
      String name;
      counter = 0; 
      name = "";
      
      for (int k = 0; k < url.length(); k++) {
         if (url.charAt(k) == '/')
            counter++;
         if (counter == 4 && url.charAt(k) != '/')
            name = name + url.charAt(k) ;
      }
      counter = 0;
      return name;
   }
   
   @Override
   public String getPageContents() { 
      String contents;
      contents = (super.getPageContents()).replace("null", "") ;
      return contents;
   }
}