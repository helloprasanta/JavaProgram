package com.prasanta;
// Test_RunExecution.java

class MyRunnable implements Runnable
{
    public void run()
	{
		System.out.println("From MyRunnable.run()");
	}
}
class MyThread extends Thread
{
	MyThread()
	{
	super();
	}
	MyThread(Runnable r)
	{
		super(r);

	}
	public void run()
	{
        System.out.println("From MyThread.run()");
	}
}
class Test_RunExecution
{
    public static void main(String args[])
	{
		
		Thread th1=new Thread();
		th1.start();

		MyThread mt=new MyThread();
		mt.start();
       
        MyRunnable mr=new MyRunnable();
		//mr.start();
		Thread th2=new Thread(mr);
		th2.start();

		MyThread mt=new MyThread();
		Thread th3=new Thread(mt);
		th3.start();
          
		  Thread th4=new MyThread();
		  th4.start();
             


			 //Thread th5=new MyRunnable();
			 //th5.start();


             
			 Runnable r=new MyRunnable();
			// r.start();
			Thread th6=new Thread(r);
			th6.start();
              

          MyRunnable mr2=new MyRunnable();
		  MyThread mt2=new MyThread(mr2);
		  mt2.start();

	}

}