package com.prasanta;

class  factory
{
	public static void main(String[] args) 
	{
		bike pulsar= new bike("ABC123QW","PINK");
		bike bullet= new bike("SGDH34EW","BLACK");
			pulsar.setownername("PRASANTA KUMAR PARIDA");
		    pulsar.setbikenum("OR 01Q 6035");
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
