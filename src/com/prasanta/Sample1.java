package com.prasanta;

class Sample1 extends Example1
{
	static int b=m3();
	static
	{
     System.out.println("Sample Static Block");
	}
	int y=m4();
	{
		System.out.println("Sample Non Static Block");
	}
	Sample1()
	{
		System.out.println("Sample Constructor");
	}
	static int m3()
	{
		System.out.println("Sample Static Variable Created");
		return 30;
	}
	int m4()
	{
		System.out.println("Sample Non Ststic Variable Created");
		return 40;
	}
	void abc()
	{
		System.out.println("Sample abc");
	}

	public static void main(String[] args) 
	{
		System.out.println("Sample Main");
		Sample1 s=new Sample1();
		s.abc();
		s.bbc();
		Example1 e= new Example1();
		e.abc();
	}
}
