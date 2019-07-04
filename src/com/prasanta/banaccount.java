package com.prasanta;

class bankaccount
{
	private double balance;
	public void getbalance(double balance)
	{
		this.balance=balance;

	}
	public double setbalance(double balance)
	{
		if(balance<=0)
		{
			System.out.println("Invalid Amount");

		}
		else
		{
			this.balance=balance;
		}
	}
}