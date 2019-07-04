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
class circlenew 
{
	public static void main(String[] args) 
	{
		circle c1=new circle(2.5);
		double a1=c1.area();
		double p1=c1.peri();
		System.out.println("The Area Is "+a1);
		System.out.println("The Perimeter Is "+p1);
	}
}
