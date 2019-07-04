package com.prasanta;

import java.util.*;
class  factory2
{
	public static void main(String[] args) 
	{
		bike pulsar= new bike("ABC123QW","PINK");
		bike bullet= new bike("SGDH34EW","BLACK");
		System.out.println("ENTER BIKE OWNER NAME :");
		
		Scanner sc= new Scanner(System.in);
		Scanner sc1= new Scanner(System.in);
			pulsar.setownername(sc.next());
			System.out.println("ENTER BIKE NUMBER :");
		    pulsar.setbikenum(sc1.next());
			bullet.setownername("CHANDRAKANTA PARIDA");
		    bullet.setbikenum("OD 01L 6435");
			bullet.start();
			bullet.move();
			bullet.stop();
			bullet.display();
			System.out.println();
			System.out.println();
			System.out.println();
			pulsar.start();
			pulsar.move();
			pulsar.stop();
			pulsar.display();
			

	}
}
