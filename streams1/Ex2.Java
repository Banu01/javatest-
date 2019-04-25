import java.util.Scanner;
class Ex2{
    static double converkms(double miles)
    {
        double km=1.609*miles;
        return km;
    }


    static double convermiles(double km)
    {
        double miles=km/1.609;
        return miles;
    }
public static void main(String[] args) {
    try {
        Scanner sc=new Scanner(System.in);
    


System.out.println("enter dis in miles");
double miles=sc.nextDouble();

System.out.println("enter dis in km");
double kmss=sc.nextDouble();

System.out.println("miles"+"equls to"+converkms(kmss));

System.out.println("km"+"equls to"+convermiles(miles));

    }
    catch(Exception E)
    {
        System.out.println("EXCEPTION"+E.getMessage());
    }
  }
}

