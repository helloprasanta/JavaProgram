package com.prasanta;

class surname
{
	public static void main(String[] args) 
	{
		int i;
		StringBuffer s= new StringBuffer("Prasanta Kumar Parida");
		StringBuffer s1= new StringBuffer();
		i=s.lastIndexOf(" ");
		s1.append(s.substring(i+1));
		s1.append(' ').append(s.substring(0,i));
		System.out.println(s1);
	}
}
