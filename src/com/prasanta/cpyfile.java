package com.prasanta;

import java.io.*;
class  cpyfile
{
	public static void main(String[] args) throws IOException
	{
		int i;
		FileInputStream fin= new FileInputStream(args[0]);
		FileOutputStream fout = new FileOutputStream(args[1]);
		do
		{
			i=fin.read();
			if(i != -1)
			{
				fout.write((char)i);
			}
		}while (i != -1);
		fin.close();
		fout.close();
	}
}
