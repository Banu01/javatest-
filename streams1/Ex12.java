// Exercise 12:
// Print the array in simplest way
// String[][] deepArray = new String[][] {{"John", "Mary"}, {"Alice", "Bob"}};

/**
 * Ex12
 */
import java.lang.String;
import java.util.Arrays;
public class Ex12 {
    public static void main(String[] args) {
   // String[] deepArray = new String[] {"John","Mary"};


   String[][] deepArray = new String[][] {{"John", "Mary"}, {"Alice", "Bob"}};
    // {"Alice", "Bob"}};
 
  
       // System.out.println(deepArray.toString());
      //  for(int k;k>deepArray;k++)
        //{
            System.out.println(Arrays.deepToString(deepArray));
     
 

// String[][] aastr = {{"hello", "world"},{"Goodbye", "planet"}};
// System.out.println(Arrays.deepToString(aastr));
        //}
    }
}