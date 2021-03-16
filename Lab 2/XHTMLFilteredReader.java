import java.util.ArrayList;
/**
 * A simple Java class!
 */
public class XHTMLFilteredReader extends HTMLFilteredReader
{
   // properties
   
   // constructors
   public XHTMLFilteredReader( String url) {
      super( url);
   }
   
   // methods
   public ArrayList<String> getLinks() {
      ArrayList<String> links;
      int startIndex;
      int endIndex;
      startIndex = 0;
      endIndex = 0;
      links = new ArrayList<String>();
      
      while (getPageContents().indexOf("href=", endIndex) != -1) {
         startIndex = getPageContents().indexOf("href=", endIndex) + 6;
         endIndex = getPageContents().indexOf("\">", startIndex)  ;
         links.add (getPageContents().substring(startIndex, endIndex));
      }
      return links;
   }
   
   @Override
   public String getPageContents() {
      return getUnfilteredPageContents();
   }
}