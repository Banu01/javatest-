import java.util.ArrayList;

/**
 * Ex6
 * Class Employee{
int empid;
String name;
String dept;
float salary;
}
 */
public class Ex6 {

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
    return empid+name+salary+dept;
}
public static void main(String[] args) {
    Ex6 ee=new Ex6();
    ArrayList<Ex6> al=new ArrayList<Ex6>();

ee.setSalary(2000);
ee.setDept("cs");
ee.setEmpid(3);
ee.setName("uma");
al.add(ee);


Ex6 e2=new Ex6();
e2.setSalary(2000);
e2.setDept("cs");
e2.setEmpid(3);
e2.setName("banu");
al.add(e2);

System.out.println(al);

}
}