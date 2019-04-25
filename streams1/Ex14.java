import java.util.Arrays;
import java.util.List;

// Exercise 14:
// Create list from comma separated String
// String commaSeparated = "item1 , item2 , item3";
// [item1, item2, item3]



/**
 * Ex14
 */
public class Ex14 {
    public static void main(String[] args) {
        
        String commaSeparated = "item1 , item2 , item3";
    
  //List  <String> al=Arrays.asList("item1 , item2 , item3");

  List  <String> al=Arrays.asList(commaSeparated);
    System.out.println(al);

}
}