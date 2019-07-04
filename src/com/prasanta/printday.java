package com.prasanta;

import java.io.*;
class printday 
{
	public static void main(String[] args) throws IOException 
	{
		int no;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Choice 1:2:3:4:5:6:7");
		no=Integer.parseInt(br.readLine());
		switch(no)
		{
			case 1:
				System.out.println("Sunday");
			break;
			case 2:
				System.out.println("Monday");
			break;
			case 3:
				System.out.println("Tuesday");
			break;
			case 4:
				System.out.println("Wednesday");
			break;
			case 5:
				System.out.println("Thursday");
			break;
			case 6:
				System.out.println("Friday");
			break;
			case 7:
				System.out.println("Saturday");
			break;
			default:
				System.out.println("Enter Correct Choice");
			break;
		}

	}
}
