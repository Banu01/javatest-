import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * Noscan
 */
public class Noscan {

    public static void main(String args[]) {
        List<Integer> ll=Arrays.asList(1,3,5,2,6,8,13,23,6,6,6,4,6,3,1);
        {
         // System.out.println("ll"+ll);
System.out.println(Collections.frequency(ll, 6));


          long kk = ll.stream().distinct().count();
//forEach(System.out::println);
System.out.println(kk);
Long r =ll.stream().count();
System.out.println(r);
        };
    }
}



//List<Integer> listWithDuplicates = Lists.newArrayList(1, 1, 2, 2, 3, 3);
   // List<Integer> listWithoutDuplicates = listWithDuplicates.stream()
   //  .distinct()
   //  .collect(Collectors.toList());
//}