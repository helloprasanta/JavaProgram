package com.prasanta;

import java.io.*;
class myexception extends Exception
{
	myexception(String str)
	{
		super(str);
	}
}
class test2
{
	public static void main(String args[])throws Exception
	{
		String s= new String();
		DataInputStream d= new DataInputStream(System.in);
		System.out.println("Enter String : ");
		s=d.readLine();
		try
		{
		  	if(!s.equals("India")) throw new myexception("String Not Match with India");
			else
				System.out.println("The String Is Equals With India ");

		}
		catch (myexception ob)
		{
			System.out.println(ob.getMessage());
		}
	}
}