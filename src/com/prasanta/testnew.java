package com.prasanta;

class time
{
 int h,m,s;
 time(int x,int y,int z)
	{
	 h=x;
	 m=y;
	 s=z;
	}
	void display()
	{
	System.out.println(" Time is");
    System.out.println(h+":"+m+":"+s);
	}
}

class testnew 
{
	public static void main(String args[]) 
	{
      time t1=new time(4,23,56);
	  t1.display();
	}
}
		
