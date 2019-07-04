package com.prasanta;

import java.io.*;
class election 
{
	public static void main(String[] args) throws IOException,NumberFormatException 
	{
		DataInputStream d= new DataInputStream(System.in);
		int count[]={0,0,0,0,0};
		int i,ballot,c=0,big,b;
		String s="yes";
		while(s.equalsIgnoreCase("yes"))
		{
			System.out.println("Enter a Ballot");
			ballot=Integer.parseInt(d.readLine());
			if(ballot>=1&&ballot<=5)
				count[ballot]++;
				else
					c++;
				System.out.println("Enter Another Ballot(yes or no)");
				s=d.readLine();
		}
		big=count[0];
		b=0;
		for(i=0;i<5;i++)
		{
			if(count[i]>big)
			{
				big=count[i];
				b=i;
			}
		}
		for(i=0;i<5;i++)
		{
			System.out.println("The Candidate No "+(i+1)+"get "+count[i]+"votes");
			System.out.println("The Winner Candidate No is"+(b+1)+"He gets "+big+" no of votes");
			System.out.println("Total no of Spoilt ballot ="+c);
		}
	}
}