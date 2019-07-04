package com.prasanta;

import java.net.*;
import java.io.*;
 
public class ip
{
	public static void main(String args[]) throws Exception
	{
		InetAddress ipadd =InetAddress.getLocalHost();
		System.out.println("Host and Address :"+ipadd);
		System.out.println("Host name :"+ipadd.getHostName());
 
		String n=ipadd.toString();
		System.out.println("IP address :"+n.substring(n.indexOf("/")+1));
	}
}