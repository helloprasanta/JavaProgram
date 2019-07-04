package com.prasanta;

import java.io.*;

class FOSDemo1 
{
	public static void main(String[] args) throws FileNotFoundException,IOException 
	{
      FileInputStream fis=new FileInputStream("Prasanta.txt");
	  int data=fis.read();
	  System.out.println(data);
	  fis.close();
	  fis=null;
	}
}
