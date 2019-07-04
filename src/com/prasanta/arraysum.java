package com.prasanta;

import java.io.*;
class arraysum 
{
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		int i,sum=0;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Array Elements ");
		try
		{
			for(i=0;i<5;i++)
			{
				a[i]=Integer.parseInt(br.readLine());
			}
			for(i=0;i<5;i++)
			{
				sum=sum+a[i];
			}

           System.out.println("Sum Is  "+sum);
		}
		catch (Exception e)
		{
		}
	}
}
