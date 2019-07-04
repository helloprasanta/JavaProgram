package com.prasanta;

import java.util.*;
class  prasanta22
{
	public static void main(String[] args) 
	{
		prasanta21 var= new prasanta21();
		Scanner scn= new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter Gear No:");
		var.setgearno(scn.nextInt());
		System.out.println("Bike Is Running with "+var.getgearno());
		}
	}
}
