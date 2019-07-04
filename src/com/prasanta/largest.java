package com.prasanta;

import java.io.*;
class largest
{
public static void main(String args[])throws java.io.IOExecption
{
InputStreamReader i= new InputStreamReader(System.in);
BufferedReader a= new BufferedReader(System.in);
int x,y,z;
System.out.println(" Enter The Value Of X Y Z");
x=Integer.parseInt(a.readline());
y=Integer.parseInt(a.readline());
z=Integer.parseInt(a.readline());
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

