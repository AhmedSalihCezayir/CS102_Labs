/**
 * A simple Java class!
 */
public class HTMLFilteredReader extends MySimpleURLReader 
{
   // properties
   
   // constructors
   public HTMLFilteredReader( String url) {
      super( url);
   }
   
   // methods
   public String  getUnfilteredPageContents() {
      boolean printSwitch;
      String content;
      printSwitch = true;
      content = "";
      
      for (int i = 0; i < getPageContents().length(); i++) {
         if (getPageContents().charAt(i) == '<' || getPageContents().charAt(i) == '>')
            printSwitch = !printSwitch;
         if (printSwitch && getPageContents().charAt(i) != '<' && getPageContents().charAt(i) != '>')
            content = content + getPageContents().charAt(i);
      }
      return content;
   }
   
   
}