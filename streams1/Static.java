/**
 * Static
 */
public class Static {
 static int a=4;
 static String hh="hai";

Static()
{
    System.out.println("static constructor working");
}



    static void hai()
    {

        System.out.println("my static method::"+hh);
        System.out.println("my static method::"+a);
    }

    static
    {
        System.out.println("my static block working:"+" "+"good morning");
    }





    public static void main(String[] args) {
        Static ss=new Static();
        Static.hai();
    }
}