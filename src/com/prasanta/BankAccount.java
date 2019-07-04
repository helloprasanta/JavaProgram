package com.prasanta;

class Bankaccount
{
	private double balance;
	public double getbalance()
	{
		return this.balance=balance;

	}
	public void setbalance(double balance)
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