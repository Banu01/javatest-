
// package src.main.java.com.kgisl.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
class Student {
    /**
     *
     */

    // private static final String ANU = "anu";
    int rno;
    int price;
    String name;
    float percentage;

    /**
     * @return the rno
     */
    public int getRno() {
        return rno;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the percentage
     */
    public float getPercentage() {
        return percentage;
    }

    /**
     * @param rno the rno to set
     */
    public void setRno(int rno) {
        this.rno = rno;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param percentage the percentage to set
     */
    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return rno + name + percentage + price;
    }

    // static class Stud extends Student {

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        // Student s=new Student();
        // List<Student> al_students= new ArrayList<Student>();
        Student s1 = new Student();
        s1.setRno(2);
        s1.setName("anusha");
        s1.setPercentage(90);
        s1.setPrice(100);
        // al.add(s1);

        Student s2 = new Student();
        s2.setRno(5);
        s2.setName("divya");
        s2.setPercentage(85);
        s2.setPrice(200);

        // al.add(s2);

        Student s3 = new Student();
        s3.setRno(8);
        s3.setName("xiozee");
        s3.setPercentage(70);
        s3.setPrice(700);
        // al.add(s3);

        ArrayList<Student> student = new ArrayList<Student>();
        ArrayList<Student> student2 = student;
        student2.add(s1);
        student2.add(s2);
        student2.add(s3);

        System.out.println(student2);

        System.out.println("Print Array List");
        student2.forEach(System.out::println);

        // System.out.println("\nSorting");
        // List<Student> slist = ((ArrayList<Student>)
        // Student.stream()).sorted(Comparator.comparingInt(Student::getRno).thenComparing(Student::getName))
        // .collect(Collectors.toList());
        // slist.forEach(System.out::println);

        // }
        // List<Integer> li=student.stream().map(n->n.getAge()).

        List<String> getnames = student2.stream().map(p -> p.getName()).collect(Collectors.toList());
        System.out.println(getnames);

        List<Integer> getrno = student2.stream().map(x -> x.getRno()).collect(Collectors.toList());
        System.out.println(getrno);

        List<Float> percen = student2.stream().map(c -> c.getPercentage()).collect(Collectors.toList());
        System.out.println(percen);

        System.out.println("price mapping***********************************");

        List<Integer> pr = student2.stream().map(a -> a.getPrice()).collect(Collectors.toList());
        System.out.println(pr);

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream.forEach(p -> System.out.println(p));

        Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).max(Comparator.comparing(Integer::valueOf)).get();

        System.out.println("maxi " + maxNumber);

        Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).min(Comparator.comparing(Integer::valueOf)).get();

        System.out.println("mini= " + minNumber);

        String max = Stream.of("H", "T", "D", "I", "J").max(Comparator.comparing(String::valueOf)).get();
        System.out.println(max);

        // List <Integer> pr=student.stream().filter(s->s);
        // System.out.println(pr);

        // productsList.stream()
        // .filter(p ->p.price> 30000) // filtering price
        // .map(pm ->pm.price) // fetching price
        // .forEach(System.out::println); // iterating price

        student2.stream().filter(p -> p.price > 50) // filtering price
                .map(pm -> pm.price) // fetching price
                .forEach(System.out::println); // iterating price

        System.out.println("greater checking");

        student2.stream().filter(s -> s.price < 200).map(k -> k.price).forEach(System.out::println);

        Stream<Integer> any = Stream.of(1, 3, 5, 6, 78, 9);
        System.out.println(any.anyMatch(i -> i == 3));

        Stream<Integer> all = Stream.of(10, 20, 10, 10);
        System.out.println(all.allMatch(m -> m == 10));

        Stream<Integer> no = Stream.of(1, 3, 5, 8, 10);
        System.out.println(no.noneMatch(p -> p == 7));

        System.out.println("\nFind Maximum");
        student2.stream().max(Comparator.comparing(Student::getPrice))
                .ifPresent(p -> System.out.println("Max Price" + p));

        System.out.println("minimum");
        student2.stream().min(Comparator.comparing(Student::getRno)).ifPresent(h -> System.out.println(h));

        System.out.println("=========================minimum price===================");
        student2.stream().min(Comparator.comparing(Student::getPrice)).ifPresent(k -> System.out.println(k));

        System.out.println("********************sort********************************");
        List<Student> l = student2.stream()
                .sorted(Comparator.comparing(Student::getName).thenComparing(Student::getRno))
                .collect(Collectors.toList());
        l.forEach(System.out::println);

        System.out.println("*******************************SORTpercentage***********************");
        student2.stream().sorted(Comparator.comparing(Student::getPrice).thenComparing(Student::getRno))
                .forEach(System.out::println);

        System.out.println("=======================SUM===================Total");
        int sum1 = student2.stream().mapToInt(p -> p.getPrice()).sum();
        System.out.println("Total " + sum1);
System.out.println("*************************maptoint**********************");
        List<String> list = Arrays.asList("Gs", "for", "gfg");

        list.stream().mapToInt(str -> str.length()).forEach(System.out::println);




// student.stream().mapToInt(l->l.length()).forEach(System.out.println());
        
       // Stream<Integer> stream2 = numbers.stream();

        // System.out.println("--------Stream elements after skipping----------");
        // stream2.skip(2).forEach((a) -> {
        //    System.out.println(a);
        













// System.out.println("\nSorting");
// List<Product> slist = products.stream().sorted(Comparator.comparing(Product::getCategory).thenComparing(Product::getName)).collect(Collectors.toList());
// slist.forEach(System.out::println);




        // ArrayList<String>memberNames=new ArrayList<String>("banu","uma");

        // String max = Stream.of("H", "T", "D", "I", "J")
        // .max(Comparator.comparing(String::valueOf))
        // .get();
        // System.out.println(max);

        // memberNames.stream.of(Anu, "uma").filter((s) -> s.startsWith("A"))
        //              .map(memberNames::toUpperCase)
        //              .forEach(System.out::println);






        // String max = Stream.of("H", "T", "D", "I", "J").max(Comparator.comparing(String::valueOf)).get();
        // System.out.println(max);




        //Integer map=Stream.of(3,6).map(n->n*n).forEach(System.out::println);













    }  

                        
 











                


    private Object length() {
        return null;
    }

    private static Stream<Student> stream() {
        return null;
    }
    }



