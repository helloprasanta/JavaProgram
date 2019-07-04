package com.prasanta;

import java.io.*;
class evenodd
{
public static void main(String args[])throws IOException
{
InputStreamReader i= new InputStreamReader(System.in);
BufferedReader a= new BufferedReader(i);
System.out.println("Enter A Number");
int no=Integer.parseInt(a.readLine());
if(no%2==0)
{
System.out.println("The Number Is Even");
}
else
{
System.out.println("The Number Is odd");
}
}
}