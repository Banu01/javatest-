import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Ex13
 * 
 * 
Exercise 13:
Convert ArrayList<String> to String[] array
 */
public class Ex13 {
public static void main(String args[]) 
    {

    List<String> al = Arrays.asList("banu", "uma");
    //ArrayList<String> al = new ArrayList<String>("banu","uma");

   for(String bb : al)
   {
       System.out.println(bb);
   }
  // String[] array=al;
   System.out.println(al);
   al.stream().toArray();
        List<List<String>> aa = Arrays.asList(al);
        System.out.println(aa);
}
}

//Convert ArrayList<String> to String[] array