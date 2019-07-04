package com.prasanta;

import java.io.*;
class bank
{
	String name;
	String acno;
	float amount;
	String typeac;
	void initialValue(String name1,String acc_no,float bal,String type)
	{
		name=name1;
		acno=acc_no;
		amount=bal;
		typeac=type;
	}
	void deposite(String acc_no1,float bal1)
	{
		if(acno.equals(acc_no1))
			amount=amount+bal1;
	}
	void withdraw(String acc_no1,float bal1)
	{
		if(acno.equals(acc_no1))
		{
			if((amount-bal1)>500)
				amount=amount-bal1;
			else
				System.out.println(" Balance is Not Suffitient");
		}
	}
	void display()
	{
		System.out.println(name+"\t"+amount);
	}
}
class account
{
	public static void main(String args[])throws Exception
	{
		String name2,acc_no2,type2;
		float bal2;
		DataInputStream d= new DataInputStream(System.in);
		int n,ch,i;
		bank b[]=new bank[100];
		System.out.println(" Enter How Many Account Holder ");
		n=Integer.parseInt(d.readLine());
		for(i=0;i<n;i++)
		{
			System.out.println("Enter The Name Of The Account Holder :");
			name2=d.readLine();
			System.out.println(" Enter The Account Number Of The Account Holder :");
			acc_no2=d.readLine();
			System.out.println(" Enter The Balance Of Account Holder :");
			bal2=Float.parseFloat(d.readLine());
			System.out.println(" Enter The Type Of The Account ");
			type2=d.readLine();
			b[i]=new bank();
			b[i].initialValue(name2,acc_no2,bal2,type2);
		}
		while(true)
		{
			System.out.println(" 1. Deposite ");
			System.out.println(" 2. Withdraw ");
			System.out.println(" 3. Display ");
			System.out.println(" Enter Your Choice (1,2,3)");
			ch=Integer.parseInt(d.readLine());
			switch(ch)
			{
				case 1:
					System.out.println("Enter Account Number: ");
				acc_no2=d.readLine();
				System.out.println(" Enter The Deposite Amount: ");
				bal2=Float.parseFloat(d.readLine());
				for(i=0;i<n;i++)
					b[i].deposite(acc_no2,bal2);
				break;
				case 2:
					System.out.println(" Enter Account Number: ");
				acc_no2=d.readLine();
				System.out.println(" Enter The Withdraw Amount: ");
				bal2=Float.parseFloat(d.readLine());
				for(i=0;i<n;i++)
					b[i].withdraw(acc_no2,bal2);
				break;
				case 3:
					for(i=0;i<n;i++)
					b[i].display();
				break;
				default:
					System.exit(0);
			}
		}
	}
}









