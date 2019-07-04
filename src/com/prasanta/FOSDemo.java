package com.prasanta;

import java.io.*;

class FOSDemo 
{
	public static void main(String[] args) throws FileNotFoundException,IOException 
	{
      FileOutputStream fos=new FileOutputStream("Prasanta.txt");
	  fos.write(98);
	  fos.close();
	  fos=null;
	}
}
