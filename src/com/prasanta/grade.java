package com.prasanta;

class grade
{
	public static void main(String args[])throws java.io.IOException
	{
		java.io.InputStreamReader i=new java.io.InputStreamReader(System.in);
			java.io.BufferedReader a =new java.io.BufferedReader(i);
		System.out.println("Enter The Mark Of The Student");
		int m=Integer.parseInt(a.readLine());
		if(m>=90)
		{
			System.out.println(" O grade");
		}
		else if(m>=80)
		{
			System.out.println("E grade");
		}
		else if(m>=70)
		{
			System.out.println(" A grade");
		}
		else
		{
			System.out.println(" F grade");
		}
	}
}
