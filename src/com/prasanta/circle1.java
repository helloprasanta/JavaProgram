package com.prasanta;

class circle
{
double r;
circle(double s)
	{
	r=s;
	}
	double area()
	{
		double a;
		a=3.14*r*r;
		return(a);
	}
	double peri()
	{
		double p;
		p=2*3.14*r;
		return(p);
	}
}
class circle1 
{
	public static void main(String[] args) 
	{
		circle c=new circle(2.5);
		double a1=c.area();
		double p1=c.peri(); 
		System.out.println("The Area Of Circle Is"+ a1);
		System.out.println("The Perimeter of Circle Is "+ p1);
	}
}
