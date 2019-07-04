package com.prasanta;

class Test09
{
	public static void main(String[] args) 
	{
		String s1= new String("Prasanta Kumar Parida");
		int j=s1.length();
		int i;
		for (i=0;i<j;i++)
			
		{
			char ch=s1.charAt(i);
			if(ch==32)
			{
               s1.deleteCharAt(i);
			}
			
		}
		System.out.println(s1);
        //System.out.println(s1.deleteCharAt(2));
		
	}
}
