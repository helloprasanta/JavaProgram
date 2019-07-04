package com.prasanta;

import java.io.DataInputStream;
class natural 
{
	public static void main(String[] args) 
	{
	DataInputStream in= new DataInputStream(System.in);
	int n=0;
	int i=1,sum=0;
	System.out.println("Enter the Natural Number");
	try
	{
	n=Integer.parseInt(in.readLine());	
	}
	catch (Exception e)
	{
	}
	while(i<=n)
		{
		sum=sum+(i*i);
		i=i+1;
		}
		System.out.println(" Sum is="+sum);
	}
}

