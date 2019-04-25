import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.System.out;

import java.lang.System;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Test
 */
public class Test {

    /**
     *
     */

    // private static final int _2018 = 2018;
    int id, m1, m2, m3, year;
    String name, department, college;

    /**
     * @return the college
     */
    public String getCollege() {
        return college;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the m1
     */
    public int getM1() {
        return m1;
    }

    /**
     * @return the m2
     */
    public int getM2() {
        return m2;
    }

    /**
     * @return the m3
     */
    public int getM3() {
        return m3;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param college the college to set
     */
    public void setCollege(String college) {
        this.college = college;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param m1 the m1 to set
     */
    public void setM1(int m1) {
        this.m1 = m1;
    }

    /**
     * @param m2 the m2 to set
     */
    public void setM2(int m2) {
        this.m2 = m2;
    }

    /**
     * @param m3 the m3 to set
     */
    public void setM3(int m3) {
        this.m3 = m3;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "id:" + id + "\n name:" + name + "\n college:" + college + "\n dept:" + department + "\n mark1:" + m1
                + "\n mark2:" + m2 + "\n mark3:" + m3 + "\n year:" + year;
    }

    public static void main(String[] args) {
        ArrayList<Test> t = new ArrayList<Test>();
        Test t1 = new Test();
        t1.setCollege("kgcas");
        t1.setDepartment("computer science");
        t1.setId(1);
        t1.setM1(70);
        t1.setM2(83);
        t1.setM3(86);
        t1.setName("dora");
        t1.setYear(2014);
        t.add(t1);
        Test t2 = new Test();
        t2.setCollege("kite");
        t2.setDepartment("computer technology");
        t2.setId(2);
        t2.setM1(78);
        t2.setM2(85);
        t2.setM3(96);
        t2.setName("bujji");
        t2.setYear(2016);
        t.add(t2);

        Test t3 = new Test();
        t3.setCollege("college:sns");
        t3.setDepartment("dept:information technology");
        t3.setId(3);
        t3.setM1(58);
        t3.setM2(95);
        t3.setM3(76);
        t3.setName("anitha");
        t3.setYear(2017);
        t.add(t3);

        Test t4 = new Test();
        t4.setCollege("college:IIM");
        t4.setDepartment("dept:Bca");
        t4.setId(4);
        t4.setM1(68);
        t4.setM2(75);
        t4.setM3(76);
        t4.setName("anusha");
        t4.setYear(2018);
        t.add(t4);

        Test t5 = new Test();
        t5.setCollege("college:kct");
        t5.setDepartment("dept:ece");
        t5.setId(5);
        t5.setM1(98);
        t5.setM2(65);
        t5.setM3(86);
        t5.setName("akalya");
        t5.setYear(2019);
        t.add(t5);

        System.out.println("Print Array List");
        t.forEach(System.out::println);

        System.out.println("************student names***************");
        List<String> name = t.stream().map(p -> p.getName()).collect(Collectors.toList());
        System.out.println(name);

        System.out.println("Department names");

        List<String> dt = t.stream().map(o -> o.getDepartment()).collect(Collectors.toList());
        System.out.println(dt);

        System.out.println("colleges");
        List<String> cg = t.stream().map(i -> i.getCollege()).collect(Collectors.toList());
        System.out.println(cg);

        System.out.println("first3");
        List<String> c = t.stream().map(k -> k.getCollege()).limit(3).collect(Collectors.toList());

        System.out.println(c);

        // Predicate<Test> pf=(g->g.getM1()>40 & g.getM2()>40 &g.getM3()>40);

        // System.out.println("hello"+pf);

        System.out.println("\n\n\n total of all students");
        System.out.println("\n\n\n\nfirst 2 students");
        Predicate<Test> findPassFail = s -> s.getM1() > 40 && s.getM2() > 40 && s.getM3() > 40 ;
        t.stream().filter(findPassFail)
                .map(x -> x.getM1() + x.getM2() + x.getM3() + " " + x.getName() + " ," + x.getCollege())
                .sorted(Comparator.reverseOrder()).limit(2).forEach(System.out::println);

        System.out.println("\n\n\nlast3 students");

        t.stream().filter(findPassFail)
                .map(x -> x.getM1() + x.getM2() + x.getM3() + " " + x.getName() + " ," + x.getCollege())
                .sorted(Comparator.reverseOrder()).skip(2).forEach(System.out::println);

        long dd = t.stream().filter(findPassFail).map(x -> x.getM1() + x.getM2() + x.getM3() + x.getName()).count();
        System.out.println("\n\n\ncount" + dd);

        System.out.println("\n\n\n top3 departments");

        t.stream().filter(findPassFail)
                .map(x -> x.getM1() + x.getM2() + x.getM3() + " " + x.getName() + " ," + x.getDepartment())
                .sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);




                // t.stream().filter(findPassFail)
                // .map(x -> x.getM1() + x.getM2() + x.getM3() + " " + x.getName() + " ," + x.getDepartment())
                // .sorted(Comparator.reverseOrder().limit(3).forEach(System.out::println);



        System.out.println("\n\n\naveragewise topper");



        //t.stream().filter(findPassFail)
              // .map(x -> x.getM1() + x.getM2() + x.getM3()).average();
           //     forEach(System.out::println);




        // System.out.println("=======================SUM===================Total");

        // OptionalDouble average = t
        // .stream()
        // .mapToDouble(a -> a.getM1()+a.getM2()+a.getM3())
        // .average();

        // .sorted(Comparator.reverseOrder()).limit(5).forEach(System.out::println);
        // System.out.println("\n\n\naverage"+average);

        OptionalDouble aa = t.stream().mapToDouble(p -> p.getM1() + p.getM2() + p.getM3()).average();
        System.out.println("average----->" + aa);

   //     t.stream().mapToDouble(p -> p.getM1() + p.getM2() + p.getM3()).average().map(x->x.getName()).forEach(System.out::println);

   //t.stream().mapToDouble(p -> p.getM1() + p.getM2() + p.getM3()).average().limit(3);

       // t1.stream().filter(Test::getDepartment).forEach(out::println);
       // t.stream().filter(aa).map(x->x.getDepartment()).forEach(System.out::println);

 //t.stream().filter(average).map(n->n.getId+n.getName).forEach(System::outprintln);
//
   // t.stream().filter(aa).max(x -> x.getCollege()).
         //.min(Comparator.comparing().
    //sorted(Comparator.reverseOrder()).forEach(System.out::println);
       
        OptionalDouble sum2 = t.stream().mapToInt(p -> p.getM1() + p.getM2() + p.getM3()).average();
System.out.println("average----->" + sum2);

System.out.println("\n\n\nskipping");
 t.stream().filter(findPassFail).map(x ->x.getM1() + x.getM2() + x.getM3()+ x.getName()).limit(2)
.forEach(System.out::println);
//collect(Collector.toList());




 





// System.out.println("first3");
//         List<String> c = t.stream().map(k -> k.getCollege()).limit(3).collect(Collectors.toList());

//         System.out.println(c);

        // System.out.println("\n\nminimum");
        // t.stream().min(Comparator.comparing(Test::getM1)).ifPresent(h ->
        // System.out.println(h));

        // List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Predicate<Integer> pre = new Predicate<Integer>() {

        // @Override
        // public boolean test(Integer t) {
        // return t % 2 != 0;
        // }
        // };

        // Predicate<Integer> pre1 = t -> t % 2 == 0;

        // arr.stream().filter(pre1).forEach(System.out::println);
        // arr.stream().filter(pre1.negate()).forEach(System.out::println);

        System.out.println("first3");
        // List<String>
        // c2=t.stream().map(k->k.getCollege()).().collect(Collectors.toList());

        // System.out.println(c2);

        // System.out.println("****************************last2*********************************");
        // List<String>
        // l=t.stream().map(d->d.getCollege()).skip(3).collect(Collectors.toList());
        // System.out.println(l);
        // List<String> getnames = student2.stream().map(p ->
        // p.getName()).collect(Collectors.toList());
        // System.out.println(getnames);

        // Int SummaryStatistics stats = t.stream()
        // .mapToInt((x) -> x)
        // .summaryStatistics();
        // System.out.println(stats);

       
        // int sum2 = t.stream().mapToInt(Q -> Q.getM2()).sum();
        // System.out.println("Total m2" + sum2);

        // int sum3 = t.stream().mapToInt(R -> R.getM3()).sum();
        // System.out.println("Total m3 " + sum3);

        // int avg=sum1+sum2+sum3;
        // System.out.println("average"+avg);
        // System.out.println("minimum");

        IntSummaryStatistics ag = t.stream().collect(Collectors.summarizingInt(Test::getM1));
        System.out.println("\n \n \nMax:" + ag.getMax() + ", Min:" + ag.getMin());
        System.out.println("Count:" + ag.getCount() + ", Sum:" + ag.getSum());
        System.out.println("Average:" + ag.getAverage());

        IntSummaryStatistics ag1 = t.stream().collect(Collectors.summarizingInt(Test::getM2));
        System.out.println("\n \n \nMax:" + ag1.getMax() + ", Min:" + ag1.getMin());
        System.out.println("Count:" + ag1.getCount() + ", Sum:" + ag1.getSum());
        System.out.println("Average:" + ag1.getAverage());

        IntSummaryStatistics ag3 = t.stream().collect(Collectors.summarizingInt(Test::getM3));

        System.out.println("\n \n \nMax:" + ag3.getMax() + ", Min:" + ag3.getMin() + ",Count:" + ag3.getCount()
                + ", Sum:" + ag3.getSum() + ", avg" + ag3.getAverage());

        System.out.println("**************************college count*****************");

        long tt = t.stream().map(p -> p.getCollege()).count();
        System.out.println(tt);

        // int mm=ag+ag1+ag3;


        System.out.println("=======================SUM===================Total");
        int sum1 = t.stream().mapToInt(p -> p.getM1() + p.getM2() + p.getM3()).sum();
        System.out.println("Total m1----->" + sum1);

        System.out.println("\n\nminimum");
        t.stream().min(Comparator.comparing(Test::getM1)).ifPresent(h -> System.out.println(h));

        System.out.println("\n\nMAXIMUM MARK STUD");
        t.stream().min(Comparator.comparing(Test::getM2)).ifPresent(l -> System.out.println(l));

    }

    private IntStream stream() {
        return null;
    }

    private static Collection<Test> findPassFail() {
        return null;
    }

   
}
