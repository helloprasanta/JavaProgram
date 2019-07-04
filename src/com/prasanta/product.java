package com.prasanta;

import java.io.DataInputStream;
class product
{
  
	public static void main(String[] args) 
	{
		int n=0,i=1,pro=1;
		DataInputStream in = new DataInputStream(System.in);
		System.out.println("Enter The Value of n ");
      try
      {
      	n=Integer.parseInt(in.readLine());
      }
      catch (Exception e)
      {
      }
	  do
	  {
		  pro=pro*i;
		  i++;
	  }
	  while (i<=n);
	  System.out.println("Product Is = "+pro);
	}
}
