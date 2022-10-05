public class StringRemoveWhiteSpace {
  public static void main(String args[]) {
     
        //removing white space from String from beginning and end in Java      
        String strWhiteSpace = "    This String contains White Space at beginning and end and middle    ";
        System.out.printf("String before removing White space : %n %s %n", strWhiteSpace);
        System.out.printf("length of String before removing white space %d : ", strWhiteSpace.length());
     
        //trim() method can remove white space from the beginning and end of String in Java
        String strWithoutWhiteSpace = strWhiteSpace.trim();
        System.out.printf("String after removing white space from beginning and end %n %s %n", strWithoutWhiteSpace);
        System.out.printf("length of String after removing white space from beginning and end %d : ", strWithoutWhiteSpace.length());

 
     
        //removing white space between String in Java
        String white space = "ABC DEF GHI";
        System.out.println("String with white space between words: " + white space);
     
        // \s is regular expression for white space tab etc
        String withoutspace = whitespace.replaceAll("\\s", "");
        System.out.println("String after removing white space between words and everywhere: " + withoutspace);      
     
    }    
   
}
