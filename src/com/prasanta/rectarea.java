package com.prasanta;

class rect
{
	double l,b;
	void getdata(double x,double y)
	{
		l=x;
		b=y;
	}
	double area()
	{
		double a;
		a=l*b;
		return(a);
	}
}
class  rectarea 
{
	public static void main(String[] args) 
	{
		rect r=new rect();
		rect s=new rect();
		r.l=4.0;
		r.b=3.0;
		double a1=r.l*r.b;
		System.out.println("The Area Is "+a1);
		s.getdata(1.5,2.0);
		double a2=s.area();
		System.out.println(" The Area Is "+a2);

	}
}
