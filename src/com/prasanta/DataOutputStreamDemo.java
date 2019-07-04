package com.prasanta;

import java.io.*;

class  DataOutputStreamDemo
{
	public static void main(String[] args) throws Exception
	{
        FileOutputStream fos=new FileOutputStream("data.txt");
		DataOutputStream dos=new DataOutputStream(fos);

		dos.writeInt(97);
		dos.writeFloat(3.14f);
		dos.writeChar('a');
		dos.writeBoolean(true);
		dos.writeUTF("Swagatika");

		System.out.println("Data Written To File Successfully");
	}
}
