package com.prasanta;

import java.io.DataInputStream;
class top
{
	DataInputStream in= new DataInputStream(System.in);
	int x=0;
	void getdata()
	{
		System.out.println("Enter The Number");
	try
	{
		x=Integer.parseInt(in.readLine());
	}
	catch (Exception e)
	{
	}
}
}
class middle extends top
{
	int y;
	void square()
	{
		getdata();
		y=x*x;
		System.out.println("Square Is ="+y);
	}
}
class bottom extends middle
{
	int z;
	void cube()
	{
	square();
	
		z=y*x;
		System.out.println("Cube Is ="+z);
	}
}
class inh 
{
	public static void main(String[] args) 
	{
	bottom ob= new bottom();
	//ob.getdata();
	//ob.square();
	ob.cube();
	}
}
