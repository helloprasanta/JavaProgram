package com.prasanta;

class bike
{
	String engnm,color,ownm,bknm;
	bike(String engnm,String color)
	{
		this.engnm=engnm;
		this.color=color;
	}
	void setownername(String ownm)
	{
		this.ownm=ownm;

	}
	void setbikenum(String bknm)
	{
		this.bknm=bknm;

	}
	void display()
	{
		System.out.println("Engine Number :"+this.engnm);
		System.out.println("Color         :"+this.color);
		System.out.println("Owner Name    :"+this.ownm);
		System.out.println("Bike Number   :"+this.bknm);
		
	}
	void start()
	{
		System.out.println(this.ownm+"   Started Bike");
	}
	void move()
	{
		System.out.println(this.ownm+"   Moved Bike");
	}
	void stop()
	{
		System.out.println(this.ownm+"   Stoped Bike");
	}
}