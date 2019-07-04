package com.prasanta;

//MyRunnable.java
class MyRunnable implements Runnable
{
    public void run()
	{
		System.out.println("run executed");
	}
	public static void main(String args[])
	{
		MyRunnable mr=new MyRunnable();
		Thread th=new Thread(mr);
		th.start();
		System.out.println("main executed");
	}
}
