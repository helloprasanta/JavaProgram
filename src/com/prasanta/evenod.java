package com.prasanta;

import java.io.DtataInputStream;
class even
{
public static void main(String args[])
{
DataInputStream in= new DataInputStream(system.in);
int no=0;
System.out.println("Enter A Number");
no=Integer.ParseInt(in.readLine());
if((no%2)==0)
{
System.out.println("The Number Is Even");
}
else
{
System.out.println("The Number Is odd");
}
}
}