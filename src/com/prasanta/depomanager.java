package com.prasanta;

class depomanager
{
	public static void main(String[] args) 
	{
		driver d1=new driver();
		d1.drive(new redbus());
		System.out.println();
		driver d2=new driver();
		d2.drive(new volvo());

	}
}
