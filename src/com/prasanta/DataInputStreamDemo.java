package com.prasanta;

import java.io.*;

class DataInputStreamDemo 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis=new FileInputStream("data.txt");
		DataInputStream dis=new DataInputStream(fis);

		int i1=dis.readInt();
		float f1=dis.readFloat();
		char ch2=dis.readChar();
		boolean bo1=dis.readBoolean();
		String s1=dis.readUTF();

		System.out.println(i1);
		System.out.println(f1);
		System.out.println(ch2);
		System.out.println(bo1);
		System.out.println(s1);
	}
}
