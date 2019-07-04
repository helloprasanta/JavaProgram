package com.prasanta;

class rect
{
	double l,b;
	rect()
	{
		l=0.0;
		b=0.0;
	}
	rect(double x,double y)
	{
		l=x;
		b=y;
	}
	double calperi()
	{
		double p;
		p=2*(l+b);
		return(p);
	}
}

class rectperi 
{
	public static void main(String[] args) 
	{
		rect r1=new rect();
		double p1=r1.calperi();
		System.out.println("Perimeter Of First Rectangle Is "+p1);
		rect r2=new rect(2.5,1.0);
		double p2=r2.calperi();
		System.out.println("Perimeter Of Second Rectangle Is "+p2);

	}
}
