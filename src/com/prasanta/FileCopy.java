package com.prasanta;

import java.io.*;

public class FileCopy
{
	public static void main(String args[]) throws FileNotFoundException,IOException
	{
		FileInputStream fis=new FileInputStream("abc.txt");
		FileOutputStream fos=new FileOutputStream("bbc.txt");
		int i;
		while ((i=fis.read())!=-1)
		{
			fos.write(i);
		}
		System.out.println("Data Copied Sucessfully");


	}
}