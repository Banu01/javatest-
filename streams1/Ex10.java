import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Ex10
 */
public class Ex10 {
    int empid, salary;
    String name;

    /**
     * @return the empid
     */
    public int getEmpid() {
        return empid;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param empid the empid to set
     */
    public void setEmpid(int empid) {
        this.empid = empid;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return empid+" " + name +" "+ salary;
    }

    public static void main(String[] args) {
        Ex10 ee = new Ex10();
        ArrayList<Ex10> al = new ArrayList<Ex10>();
        ee.setEmpid(1);
        ee.setName("banu");
        ee.setSalary(10000);
        al.add(ee);

        Ex10 e2 = new Ex10();
        e2.setEmpid(2);
        e2.setName("uma");
        e2.setSalary(500000);
        al.add(e2);
        System.out.println(al);
        


al.stream().forEach(System.out::println);
//al.stream().sorted().forEach(System.out::println);

// Predicate<Ex10>hh=p->ee.getSalary() >e2.getSalary();

     al.stream().map(x -> x.getEmpid() +" "+ x.getSalary() + " " + x.getName())
    .sorted(Comparator.naturalOrder())
    //reverseOrder())
     .forEach(System.out::println);
        
        
    }
}