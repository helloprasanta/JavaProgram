package com.prasanta;

import java.io.*;
public class mobileuser
{
	public static void main(String args[])throws Exception
	{
     mobile iphone=new mobile();
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("INSERT SIM :");
	 String simname=br.readLine();
	// iphone.insertsim(simname);
	 System.out.println();
     System.out.println("Type 1 and press <Enter> key to send SMS");
	 System.out.println("Type 2 and press <Enter> key to make call\n");
     System.out.println("Enter Option :");
	 String option=br.readLine();
	 String resp;
	 if(option.contains("1"))
	 {
       System.out.println("Type message and press <Enter> key:");
	   String msg=br.readLine();
	   System.out.println("Type Mobile Number and press <Enter> key:");
	   String mn=br.readLine();
	   resp=iphone.sendsms(msg,Long.parseLong(mn));
	   System.out.println(resp);
	 }
	 else if(option.contains("2"))
		{
		 System.out.println("Type Mobile Number and press <Enter> key: ");
		 String mn=br.readLine();
		 resp=iphone.dailcall(Long.parseLong(mn));
		 System.out.println(resp);
	    }
		else
		{
			System.out.println("Invalid Option");
		}

	}

}