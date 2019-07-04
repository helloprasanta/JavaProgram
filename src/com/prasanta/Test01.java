package com.prasanta;

class Test01
{
	int x=m1();
	int m1()
	{
		System.out.println("NSV");
		return 10;
	}
	{
		System.out.println("NSB");
	}
	Test01()
	{
		System.out.println("Constructor");

	}
	void m2()
	{
		System.out.println("NSM");
	}
	public static void main(String[] args) 
	{

		System.out.println("Main Method");
		Test01 ob= new Test01();
		ob.m2();
	}
}
