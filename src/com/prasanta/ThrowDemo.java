package com.prasanta;

class ThrowDemo
{ 
static void validate(int income)
{ 
if(income<30000) 
throw new ArithmeticException("not able to get loan"); 
else 
System.out.println("eligible for getting loan"); 
} 
public static void main(String args[])
{
validate(18000); 
} 
}