package com.prasanta;

class strpalindrom
{
	public static void main(String[] args) 
	{
		StringBuffer s= new StringBuffer("MADAM");
        StringBuffer s1=s.reverse();
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
