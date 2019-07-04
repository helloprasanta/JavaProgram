package com.prasanta;

//Task.java
class Task implements Runnable
{
    public void run()
	{
		for(int j=50;j>=1;j--)
		{
			System.out.println(j);
		}
		
	}
	public static void main(String args[])
	{
		Task mr=new Task();
		Thread th=new Thread(mr);
		th.start();
        System.out.println();
		System.out.println();
		System.out.println();
		for(int i=1;i<=50;i++)
		{
		System.out.println(i);
		}
	}
}
