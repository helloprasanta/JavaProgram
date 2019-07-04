package com.prasanta;

class clerk extends Thread
{
	private BankAccount acc;
	private double amt;
	public clerk(BankAccount acc,double amt)
	{
		this.acc=acc;
		this.amt=amt;
	
	}
	public void run()
	{
		acc.deposit(amt);
	}

}