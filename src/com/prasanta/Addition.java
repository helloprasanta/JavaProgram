package com.prasanta;

class Addition
{
	static int add(int a,int b)
	{
		if((a>0)&&(b>0))
		{
			return(a+b);
		}
		else
		{
			throw new IllegalArgumentException("Number Should Positive");
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			int result=Addition.add(5,6);
			System.out.println("result="+result);
		}
		catch (IllegalArgumentException e)
		{
			System.out.println(e.getMessage());

		}

		
	}
}
