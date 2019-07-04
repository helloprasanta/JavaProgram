package com.prasanta;

class prasanta21
{

	private int gearno;
	public void setgearno(int gearno)
	{

        if(gearno==0)
		{
			System.out.println("neutral");
			

		}
		else if(gearno<0 || gearno>5)
		{
			System.out.println("Invalid Gear Number");
			
		}

		else 
		{
           
            this.gearno=gearno;
		}
		
	}
	public int getgearno()
	{
		return this.gearno=gearno;
	}
}