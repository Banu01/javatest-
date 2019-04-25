import static java.util.Arrays.copyOf;

import java.util.Arrays;
import java.util.List;

/**
 * Ex111
 * 
 * / Exercise 11: // Class Employee{ // int empid; // String name; // float
 * salary; // }
 * 
 * // Use Arrays class methods // asList // binarySearch // copyOf // fill //
 * ... spread operator /** Ex11
 */
public class Ex111 {

    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1, 3, 4, 5, 7);
        System.out.println(al);

        byte[]bb=al;
        byte[] copied = copyOf(al, 2);
 
 System.out.println(Arrays.toString(copied));
        

    }
}