package com.prasanta;

import java.io.*;
class display 
{
	public static void main(String[] args) 
	{
		String a[]=new String[5];
		int i;
	    int sum;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Array Elements ");
		try
		{
			for(i=0;i<5;i++)
			{
				a[i]=(br.readLine());
			}
			

           System.out.println("Sum Is  "+'+sum+');
		}
		catch (Exception e)
		{
		}
	}
}
