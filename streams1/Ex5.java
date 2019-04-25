import java.util.Arrays;
import java.util.List;

//import java.awt.List;

/**
 * Ex5
 */
public class Ex5 {

    public static void main(String[] args) {
        List<Integer>al=Arrays.asList(1,2,2,3,45,6,6);
        al.stream().distinct().forEach(System.out::println);
        
    }
}