package com.prasanta;

class prasanta1
{
	public static void main(String[] args) 
	{
		StringBuffer s= new StringBuffer("PRASANTA");
		for(int k=s.length();k>0;k--)
		{
		System.out.println(s.substring(0,k));
		}
	}
}
