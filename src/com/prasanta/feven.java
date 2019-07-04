package com.prasanta;

import java.io.DataInputStream;
class feven 
{
	public static void main(String[] args) 
	{
		int n=0,i=0;
		DataInputStream in =new DataInputStream(System.in);
		System.out.println("Enter the Value Of n");
	try
	{
		n=Integer.parseInt(in.readLine());

	}
	catch (Exception e)
	{
	}
	for(i=2;i<=n;i=i+2)
		{
		System.out.println(i);
		}
	}
}
