
package com.prasanta;

import java.util.Scanner ;
import java.lang.String ;

public class Test10 {


    public static void main (String[] args)
    {

        String a  =null;


        Scanner scan = new Scanner(System.in);
        System.out.println("*********White Space Remover Program************\n");
        System.out.println("Enter your string\n");
         a = scan.nextLine();
        System.out.println("Input String is  :\n"+a);


        String b= a.replaceAll("\\s+","");

        System.out.println("\nOutput String is  :\n"+b);


    }
}