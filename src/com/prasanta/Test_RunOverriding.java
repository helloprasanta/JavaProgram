package com.prasanta;//Test_RunOverriding.java

//class MyRunnable implements Runnable{};
//class MyThread2 extends Thread{};
class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("run no-param");
	}
	public void run(String s)
	{
		System.out.println("run String-param");
	}

}
class Test_RunOverriding
{
	public static void main(String args[])
	{
		MyThread mt2=new MyThread2();
		mt2.start();

	}
}
class MyThread3 extends Thread
{
	public void run(String s)
	{
		System.out.println("run string-param");
	}

}
class MyRunnable implements Runnable
{
	public void run()
	{
		System.out.println("run no-param");

	}
	public void run(String s)
	{
       System.out.println("run String-param");
	}
}
