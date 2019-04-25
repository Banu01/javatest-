import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javafx.print.Collation;

// Exercise 11:
// Class Employee{
// int empid;
// String name;
// float salary;
// }

// Use Arrays class methods
// asList
// binarySearch
// copyOf
// fill
// ... spread operator
/**
 * Ex11
 */
public class Ex11 {

    int id;
    String name;
    float salary;
/**
 * @return the id
 */
public int getId() {
    return id;
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
public float getSalary() {
    return salary;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
    this.id = id;
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
public void setSalary(float salary) {
    this.salary = salary;
}
@Override
public String toString() {
    return id+name+salary;
}
public static void main(String[] args) {
    Ex11 ee= new Ex11();
    ArrayList<Ex11> al=new ArrayList<Ex11>();
    ee.setId(1);
    ee.setName("banu");
ee.setSalary(20000);
al.add(ee);

Ex11 e2= new Ex11();
e2.setId(2);
e2.setName("uma");
e2.setSalary(30000);
al.add(e2);

System.out.println(al);
for(Ex11 e7 : al)
{
    System.out.println(e7);
}

   
    System.out.println("Sorted ArrayList contains : " + al);
System.out.println(al);
   
    //search an element using binarySearch method of Collections class
  ;
}
// 
 

// int[] copy = copyOf(al,3);
}

    // private static int[] copyOf(ArrayList<Ex11> al, int i) {
    //     return null;
    // }
