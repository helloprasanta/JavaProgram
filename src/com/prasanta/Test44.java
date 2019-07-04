package com.prasanta;

// Pass By Reference
class Test44
{
	int data=100;
	void change(Test44 ob)
	{
		ob.data=ob.data+400;//changes will be in the instance variable
	}
	public static void main(String args[])
	{
		Test44 ob=new Test44();
		System.out.println("Before Change :"+ob.data);
		ob.change(ob);//Passing Object
		System.out.println("After Change  :"+ob.data);
	}
}