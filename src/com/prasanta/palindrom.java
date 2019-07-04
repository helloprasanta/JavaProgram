package com.prasanta;

class palindrom
{
	public static void main(String[] args) 
	{
		String s=("PRASANTA");
		String s1=new StringBuffer(s).reverse().toString();
		if(s.equals(s1))
		{
		System.out.println("The String Is Pallindrome");
		}
		else
		{
			System.out.println("The String Is Not Pallindrome");
		}

	}
}
