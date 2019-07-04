package com.prasanta;

//MyThread.java
class MyThread extends Thread
{
	public void run()
	{
       System.out.println("run executed");
	}

	public static void main(String[] args) 
	{
		MyThread mt= new MyThread();
		mt.start();
		System.out.println("main executed");
	}
}
