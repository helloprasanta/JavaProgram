package com.prasanta;

class pkp22
{
    static int incr(int x)
	{
		x++;
	   System.out.println("After Increment S="+x);

		return x;

	}

}
class Test41
{
	public static void main(String[] args) 
	{
		int s=10;
		System.out.println("Before Increment S="+s);
		pkp22 ob=new pkp22();
		ob.incr(s);
		
	}
}
