package com.prasanta;

import java.io.DataInputStream;
class even
{
public static void main(String args[])
{
DataInputStream in = new DataInputStream(System.in);
int no=0;
System.out.println("Enter A Number");
try
{
no=Integer.parseInt(in.readLine());
}
catch(Exception e)
{

}
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