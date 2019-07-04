package com.prasanta;

class outer
{
	int x=20;
	void test()
	{
		inner i= new inner();
		i.display();
	}
}
class inner
{
	void display()
	{
		System.out.println("The Outer X is "+ x);
	}
}
class nested
{
	public static void main(String[] args) 
	{
		outer o=new outer();
		o.test();
	}
}
