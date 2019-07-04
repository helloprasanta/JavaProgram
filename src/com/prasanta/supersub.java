package com.prasanta;

class superclass
{
	int x;
	superclass(int x)
	{
		this.x=x;
	}
	void disply()
	{
		System.out.println("Super Class X="+x);
	}
}
class sub extends superclass
{
	int y;
	sub(int x,int y)
	{
		super(x);
		this.y=y;
	}
	void display()
	{
		System.out.println("Super Class X="+x);
		System.out.println("Subclass Y="+y);
	}
}
class supersub 
{
	public static void main(String[] args) 
	{
	 sub s1=new sub(100,200);
	 s1.display();
	}
}
