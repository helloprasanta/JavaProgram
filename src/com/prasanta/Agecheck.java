package com.prasanta;

import java.lang.Exception;
import java.io.*;
class AgeException extends Exception
{
	AgeException()
	{
	}
	AgeException(String msg)
	{
		super(msg);
	}
	void checkage(int age)
	{
		try
		{
			if(age<18)
				throw new AgeException("Below Age 18");
			else
				System.out.println("Right Age");
			
		}
		catch (AgeException ob)
		{
			System.out.println(ob.getMessage());
		}
	}
}
class Agecheck 
{
	public static void main(String[] args) throws IOException
	{
		int age;
		AgeException ob=new AgeException();
		DataInputStream d= new DataInputStream(System.in);
		System.out.println("Enter a Age :");
		age=Integer.parseInt(d.readLine());
		ob.checkage(age);
	}
}
