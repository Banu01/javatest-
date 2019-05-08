package com.kgisl.qs1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * Myprogram
 */
public class Myprogram {
    public static void main(String[] args) {

        // String name1;
        // String name2;
        Scanner sc = new Scanner(System.in);
        System.out.println("hai");
        System.out.println("enter name");
        String name1 = sc.next();
        System.out.println("enter nmae2:");
        String name2 = sc.next();

        System.out.println(name1.length() + name2.length());

        try {
            FileOutputStream io = new FileOutputStream(new File("d://my.txt"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          
        }






}

}