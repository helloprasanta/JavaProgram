package com.prasanta;

public class PyramidNumber {

public static void main(String[] args) {
	int cnt=1;
for (int i = 1; i <= 6; i++) {

  // Print leading space

        for (int j = 6 - i; j >= 1; j--)

        System.out.print("   ");

 

        for (int j = i; j >= 1; j--)

        System.out.print((j +cnt)" ");

       System.out.println();

        }

System.out.println();

}

}