package com.prasanta;

class a
{
	private int a=10;
	        int b=20;
  protected int c=30;
  public    int d=40;

}
class c extends a
{
	public static void main(String args[])
	{
		c v=new c();
//System.out.println(v.a);
System.out.println(v.b);
System.out.println(v.c);
System.out.println(v.d);
	}

}