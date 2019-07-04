package com.prasanta;

//Test06_startoverriding.java
class MyThread extends Thread
{
    public void run()
	{
		System.out.println("run");

	}
	public void start()
	{
		System.out.println("Hiii.....");
		super.start();

	}
}
class Test06_startoverriding
{
    public static void main(String args[])
	{
       MyThread mt=new MyThread();
	   mt.start();

	}
}