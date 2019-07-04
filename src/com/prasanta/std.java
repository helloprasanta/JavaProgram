package com.prasanta;

class student
{
	int rn;
	double m1=0.0,m2=0.0,m3=0.0;
	void getdata(double x,double y,double z)
	{
		m1=x;
		m2=y;
		m3=z;
	}
	void getrn(int m)
	{
		rn=m;
	}
	double avg()
	{
		double am;
		am=(m1+m2+m3)/3;
		return(am);
	}
}
class  std
{
	public static void main(String[] args) 
	{
		student s1=new student();
		s1.getrn(21);
		System.out.println("The Student Rollno Is "+s1.rn);
		s1.getdata(50.0,60.0,70.0);
		double avgm=s1.avg();
		System.out.println("The Average Mark Of Student Is "+avgm);
	}
}
