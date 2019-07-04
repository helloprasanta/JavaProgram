package com.prasanta;

class letteroccr
{
	public static void main(String[] args) 
	{
		int i,j,count;
		char ch;
		StringBuffer s= new StringBuffer("PRASANTA");
		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			count=0;
			if(ch!=' ')
			{
				for(j=0;j<s.length();j++)
				{
					if(ch==s.charAt(j))
					{
						count++;
						s.setCharAt(j,' ');
					}
				}		
		System.out.println(ch+" Occures "+count+" times");
			}
		}
	}
}
