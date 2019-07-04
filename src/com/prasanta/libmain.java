package com.prasanta;

import java.io.*;
class lib 
{ 
int bno,fine=10,edit,date,ret,userdt; 
String auth,publi,buknam; 
void get()throws IOException 
{ 
BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
System.out.print("\tEnter the book number:"); 
bno=Integer.parseInt(br.readLine()); 
System.out.print("\tEnter the book u want:"); 
buknam=br.readLine(); 
System.out.print("\tEnter the author's name:"); 
auth=br.readLine(); 
System.out.print("\tEnter the edition:"); 
edit=Integer.parseInt(br.readLine()); 
System.out.print("\tEnter the date of issuing:"); 
date=Integer.parseInt(br.readLine()); 
System.out.print("\tEnter the return date:"); 
ret=Integer.parseInt(br.readLine()); 
} 
} 
class fin extends lib 
{ 
void get1()throws IOException 
{ 
BufferedReader br2=new BufferedReader(new InputStreamReader(System.in)); 
System.out.print("\tuser returning date:"); 
userdt=Integer.parseInt(br2.readLine()); 
if(userdt>ret+10) 
{ 
System.out.println("\t\t PAY THE FINE AMOUNT...!!!! RS:"+fine+"/-"); 
} 
} 
void disp() 
{ 
System.out.println("\t THANKS FOR USING OUR SERVICE...:-)..."); 
} 
} 
class libmain 
{ 
public static void main(String ar[])throws Exception 
{ 
BufferedReader br1=new BufferedReader(new InputStreamReader(System.in)); 
int s,k=0,i; 
fin f=new fin(); 
do 
{ 
System.out.println("\n\t\t^*^*^*^*^*^*^* LIBRARY MANAGEMENT ^*^*^*^*^*^*^"); 
System.out.println("------------------MENU-------------------------------"); 
System.out.println("\nENTER UR CHOICE\n\t1.GONNA TAKE A BOOK\n\t2.RETURN THE BOOK\n\t3.EXIT");
s=Integer.parseInt(br1.readLine()); 
switch(s) 
{ 
case 1: 
f.get(); 
f.disp(); 
break; 
case 2: 
f.get(); 
f.get1(); 
break; 
case 3: 
k=1; 
break; 
} 
} 
while(k==0); 
} 
} 
