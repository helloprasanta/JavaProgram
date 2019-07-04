package com.prasanta;

import java.util.*;
class bank2 
{
	public static void main(String[] args) 
	{
		bankaccount acc1= new bankaccount();
		System.out.println("ENTER AMOUNT :");
		Scanner sc= new Scanner(System.in);
			
		acc1.setbalance(sc.nextDouble());
		System.out.println("Available Balance is :"+acc1.getbalance());


	}
}
