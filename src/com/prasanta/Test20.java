package com.prasanta;

import java.util.*;

class Test20
{
	public static void main(String args[])
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=scn.next();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch);
		}
	}
}