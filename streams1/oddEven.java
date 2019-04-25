import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * oddEven
 */
public class oddEven {
public static void main(String[] args) {
    
List<Integer> m1=Arrays.asList(2,4,6,8,4,5,43);
//m1.stream().forEach(System.out::println);

  Predicate<Integer> p1=t->t%2==0;
      m1.stream().filter(p1)
    .forEach(System.out::println);
        
    List<Integer> even=m1.stream().filter(p1).collect(Collectors.toList());
    List<Integer> odd=m1.stream().filter(p1.negate()).collect(Collectors.toList());




     System.out.println("even"+even);
    System.out.println("odd"+odd);

// System.out.println("odd"+odd);
// m1.stream().sorted(Comparator.comparing(m1::odd)
//             .thenComparing(m1::even))
//             .forEach(System.out::println);

    
    
    
    
            //sorting by string length
//      List<String> list2 = even.stream().(Comparator.comparing(String::length))
//      .collect(Collectors.toList());
// System.out.println(list2);

// //sorting by string length and then by natural order
// List<String> list3 = even.stream().sorted(
// Comparator.comparing(String::length)
// .thenComparing(Comparator.naturalOrder()))
//      .collect(Collectors.toList());


    
    // String out = m1.stream()
    //             .sorted(Comparator.comparing(x->x.length()).thenComparing())
    //             .collect(Collectors.joining());
  
    //collect(Collectors.toList());
  //.forEach(System.out::println);
      
        //m1.stream().filter(p1.negate()).forEach(System.out::println);
      //  Integer[] arr = new Integer[m1.size()]; 
       // arr = p1.toArray(arr); 
  
        // for (Integer x : arr) 
        //     System.out.print(x + " "); 




        // Comparator<Employee> compareByName = Comparator
        // .comparing(Employee::getFirstName)
        // .thenComparing(Employee::getLastName);

    }

}
