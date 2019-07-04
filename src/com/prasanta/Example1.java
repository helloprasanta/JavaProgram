package com.prasanta;

class Example1
{
	static int a=m1();
	static
	{
		System.out.println("Example Static Block");
	}
	int x=m2();
	{
		System.out.println("Example Non Static Block");
	}
	Example1()
	{
		System.out.println("Example Constructor");
	}
	static int m1()
	{
		System.out.println("Example Static variable Created");
		return 10;
	}
	int m2()
	{
		System.out.println("Example Non Static variable Created");
		return 20;
	}
	void abc()
	{
		System.out.println("Example abc");
	}
	void bbc()
	{
		System.out.println("Example bbc");
	}
}
