package com.prasanta;

// Call By Value Example
class Test43
{
	int data=50;
	void change(int data)
	{
		data=data+50;//changes will be in the local variable only
	}
	public static void main(String args[])
	{
		Test43 ob=new Test43();
		System.out.println("Before Change :"+ob.data);
		ob.change(100);
		System.out.println("After Change  :"+ob.data);
	}
}