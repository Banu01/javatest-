import java.util.Scanner;

/**
 * Ex3
 */
public class Ex3 {

    String firstname,secondname;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your firstname");
        String firstname=sc.nextLine();
        System.out.println("enter your secondname");
        String secondname=sc.nextLine();
        System.out.println(firstname.charAt(0));
        System.out.println("totallength:"+firstname.length()+secondname.length());

        System.out.println("your first name count has:"+firstname.length());
        System.out.println("your second name count has:"+secondname.length());

        System.out.println("fullname:"+" "+firstname+" "+secondname);
        
        
System.out.println("enter your speed");
int speed=sc.nextInt();
System.out.println("enter your distance in miles");
int d=sc.nextInt();

//System.out.println("cal"+""+(18/5+speed%d));

System.out.println("at"+" "+speed +"mph,it will take"+d/speed+"hours to travel"+" "+d+" "+"miles");




    }
}