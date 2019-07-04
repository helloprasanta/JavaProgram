package com.prasanta;

class nesting
{
	int m,n;
	nesting(int x,int y)
	{
		m=x;
		n=y;
	}
	int largest()
	{
		if(m>n)
			return(m);
		else
			return(n);
	}
	void display()
	{
		int large=largest();
		System.out.println("The Largest No Is "+large);
	}
}

class  nestingnew
{
	public static void main(String[] args) 
	{
		nesting n1=new nesting(7,11);
		n1.display();
		
	}
}
