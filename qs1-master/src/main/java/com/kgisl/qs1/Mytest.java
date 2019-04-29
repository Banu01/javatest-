/**
 * Mytest
//  */
// Exercise 9:

// Class Employee{
// int empid;
// String name;
// String dept;
// float salary;
// }

// Use Java Stream

// Total salary of all employees
// Total salary for each dept
// Which department getting highest salary
// Who is getting lowest salary
// Who are all getting same salary

package com.kgisl.qs1;

import java.util.ArrayList;
import java.util.Comparator;

public class Mytest {
    int empid;
    String name;
    String dept;
    float salary;

    /**
     * @return the dept
     */
    public String getDept() {
        return dept;
    }

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
    public float getSalary() {
        return salary;
    }

    /**
     * @param dept the dept to set
     */
    public void setDept(String dept) {
        this.dept = dept;
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
    public void setSalary(float salary) {
        this.salary = salary;
    }
@Override
public String toString() {
    return empid+" "+name+""+salary+" "+dept;
}
    public static void main(String[] args) {
        Mytest mm = new Mytest();
        ArrayList<Mytest> al = new ArrayList<Mytest>();
        mm.setDept("cs");
        mm.setEmpid(1);
        mm.setName("abc");
        mm.setSalary(20000);
        al.add(mm);

        Mytest m3 = new Mytest();
        m3.setDept("cs");
        m3.setEmpid(2);
        m3.setName("xyz");
        m3.setSalary(30000);
        al.add(m3);

        Mytest m4 = new Mytest();
        m4.setDept("cs");
        m4.setEmpid(5);
        m4.setName("rst");
        m4.setSalary(50000);
        al.add(m4);

        System.out.println("Array List"+al);
        //al.forEach(System.out::println);

     
     // al.stream().min(Comparator.comparing(Mytest::getSalary)).ifPresent(s -> System.out.println(s));
     //   al.stream().max(Comparator.comparing(Mytest::getSalary)).ifPresent(j->System.out.println(j));


    }

}