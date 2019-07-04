package com.prasanta;

public class mobile
{
	private sim sm;
	public void sim(String simname)throws Exception
	{
		Class simclass=Class.forName(simname);
		Object simobject=simclass.newInstance();
		if(simobject instanceof sim)
		{
          sm=(sim)simobject;
		}
		else
	    {
			throw new Exception("Invalid Sim");
		}
	}
	public String sendsms(String msg,long mn)
	{
		return sm.sendsms(msg,mn);
	}
	public String dialcall( long mn)
	{
		return sm.dialcall(mn);
	}
}