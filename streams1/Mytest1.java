import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Test
 */
public class Mytest1 {

    /**
	 *
	 */
	
	//private static final int _2018 = 2018;
	int id,m1,m2,m3,year;
    String name,department;
    
    
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
        return "id:"+id+"\n name:"+name+"\n Mytest1:"+"\n dept:"+department+"\n mark1:"+m1+"\n mark2:"+m2+"\n mark3:"+m3+"\n year:"+year;
    }

    public static void main(String[] args) {
        Mytest1 s1 = new Mytest1(1,"anu","cse",60,90,90);
        Mytest1 s2 = new Mytest1();
        Mytest1 s3 = new Mytest1();
        Mytest1 s4 = new Mytest1();
        
        List<Mytest1> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
   
        System.out.println("\n****** All Students ******\n");
  
        students.forEach(System.out::println);
  
        // List<String> totalMarks = students.stream()
        // .map(x -> x.getId() + "," + (x.getMark1() + x.getMark2() +
        // x.getMark3())).collect(Collectors.toList());
        // System.out.println(totalMarks);
  
        System.out.println("\n****** Passed Students ******\n");
        // students.stream().filter(t -> t.getMark1() > 40 && t.getMark2() > 40 && t.getMark3() > 40)
        //         .forEach(System.out::println);
  
        Predicate<Mytest1> findPassFail = t -> t.getMark1() > 40 && t.getMark2() > 40 && t.getMark3() > 40;
        students.stream().filter(findPassFail)
        .map(x -> x.getId() + "," + (x.getMark1() + x.getMark2() +x.getMark3()))
        .forEach(System.out::println);
  
        // Predicate<Mytest1> findPassFail = new Predicate<Mytest1>() {
  
        // @Override
        // public boolean test(Mytest1 t) {
        // return t.getMark1() > 40;
        // }
        // };
  
    }
  }
}