package com.prasanta;

public abstract class docomo implements sim
{
	public String sendsms(String msg,long mn)
	{
		return "docomo:Your SMS send successfully";
	}
	public String dailcall(long mn)
	{
		return "docomo:The Number You are dailing is busy,please dail after sometime";
	}
}