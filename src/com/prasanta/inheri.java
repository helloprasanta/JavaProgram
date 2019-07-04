package com.prasanta;

class top
{
	int a;
	top(int x)
	{
		a=x;
	}
}
class middle extends top
{
	int square()
	{
	 return(a*a);
	}
}
class bottom extends middle
{
	void cube()
	{
		int c;
		c=a*a*a;
		System.out.println("Cube is "+c);
	}
}
class inheri
{
	public static void main(String[] args) 
	{
		bottom ob= new bottom(5);
		ob.square();
		ob.cube();
	}
}