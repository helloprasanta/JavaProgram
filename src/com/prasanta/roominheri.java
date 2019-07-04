package com.prasanta;

class room
{
	double l,b;
	room(double x,double y)
	{
		l=x;
		b=y;
	}
	double area()
	{
		return(l*b);
	}
}
class bedroom extends room
{
	double h;
	bedroom(double x,double y,double z)
	{
		super(x,y);
		h=z;
	}
	double volume()
	{
		return(l*b*h);
	}
}
class roominheri
{
	public static void main(String[] args) 
	{
		bedroom r1=new bedroom(2.0,5.0,3.0);
		double a=r1.area();
		double v=r1.volume();
		System.out.println("Area ="+a);
		System.out.println("Volume ="+v);
	}
}
