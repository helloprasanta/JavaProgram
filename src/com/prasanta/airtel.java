package com.prasanta;

public  class airtel implements sim
{
	public String sendsms(String msg,long mn)
	{
		return "AirTel:Your SMS send successfully";
	}
	public String dailcall(long mn)
	{
		return "AirTel:The Number You are dailing is busy,please dail after sometime";
	}
}