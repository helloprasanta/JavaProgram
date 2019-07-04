package com.prasanta;

import java.io.*;
class lar
{
public static void main(String args[])throws IOException
{
InputStreamReader i= new InputStreamReader(System.in);
BufferedReader a= new BufferedReader(i);
int x=0,y=0,z=0;
System.out.println(" Enter The Value Of X Y Z");
x=Integer.parseInt(a.readLine());
y=Integer.parseInt(a.readLine());
z=Integer.parseInt(a.readLine());
if((x>y)&&(x>z))
{
System.out.println("X is Largest among them");
}
else if(y>z)
{
System.out.println(" Y is Largest among them");
}
else
{
System.out.println(" Z is Largest among them");
}
}
}

