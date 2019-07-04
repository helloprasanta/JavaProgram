package com.prasanta;

class prasanta
{
	public static void main(String[] args) 
	{
		int i,l;
		StringBuffer s=new StringBuffer("Prasanta Kumar Parida");
	    StringBuffer s1= new StringBuffer();
		l=s.lastIndexOf(" ");
		s1.append(s.charAt(0));
		for(i=0;i<l;i++)
		{
			if(s.charAt(i)==(' '))
			{
				s1.append('.').append(s.charAt(i+1));
			}
		}
		s1.append(s.substring(l+1));
		System.out.println(s1);
	}
}
