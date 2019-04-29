package com.kgisl.qs1;



import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

/**
 * Ebbill
 */
public class Ebbill {

    int id;
    String name;
    int amt,unit;
    public static void main(String[] args) {
        

Scanner sc=new Scanner(System.in);
System.out.println("enter the id");

int id=sc.nextInt();

System.out.println("enter the name");
String name=sc.next();


System.out.println("enter the unit");
int unit=sc.nextInt();

//if(unit>200 && unit<400 && unit>400 && unit<600 && unit>600)
if(unit>200 && unit>400)
{
    System.out.println(unit*1.50);
}
else if(unit>400 && unit<600)
{
    System.out.println(unit*1.80);
}
else if(unit>190)
{
    System.out.println(unit*1.20);
}
else
{
    System.out.println("amount charged 2.00 per unit"+unit*2.00);
}
    }
// {
//     System.out.println(unit*1.00);

// }
// else
// {
// System.out.println(unit*1.50);
// }
// elseif
// {
//     System.out.println(unit*);
// }
//     }
}