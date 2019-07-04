package com.prasanta;

public abstract class vodafone implements sim
{
	public String sendsms(String msg,long mn)
	{
		return "vodafone:Your SMS send successfully";
	}
	public String dailcall(long mn)
	{
		return "vodafone:The Number You are dailing is not reachable,please dail after sometime";
	}
}