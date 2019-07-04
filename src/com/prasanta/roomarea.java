package com.prasanta;

class room
{
	double l,b;
	room(double x,double y)
	{
		l=x;
		b=y;
	}
	room(double x)
	{
		l=b=x;
	}
	void display()
	{
		double area;
		area=l*b;
		System.out.println("The Area is"+area);
	}
}
class roomarea
{
	public static void main(String[] args) 
	{
		room r1=new room(5.0);
		room r2=new room(5.0,3.0);
		r1.display();
		r2.display();
	}
}
