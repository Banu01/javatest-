/**
 * Ex4
 */
public class Ex4 {

    int empid;
    String name;
    float salary;
    Ex4()
    {
        this(4);
     
        System.out.println("firstconstructor");
    }
        Ex4(int empid)
        {
            this.empid=empid;
      
System.out.println("second constructor"+" "+empid);
        }
        

    // private void Ex4(int empid2) {
    // }

    // private void Ex4() {
    // }
    public static void main(String[] args) {
         new Ex4();
    }
}