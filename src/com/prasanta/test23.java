package com.prasanta;

import java.util.*;
class test23 
{
	public static void main(String[] args) 
	{
		int no=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A Number");
		no=Integer.parseInt(sc.next());
		if((no%2)==0)
		{
          System.out.println("The Number is Even");
		}
		else{
			System.out.println("The Number is Odd");
		}

	}
}
