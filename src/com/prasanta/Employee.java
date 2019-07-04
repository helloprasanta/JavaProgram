package com.prasanta;

class Employee
{
	int eno;
	String ename;
	double sal;
	String dept;
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.eno=345;
		e1.ename="Swagatika";
		e1.sal=2532.12;
		e1.dept="Java";
		System.out.println(e1.eno);
		System.out.println(e1.ename);
		System.out.println(e1.sal);
		System.out.println(e1.dept);
	}
}
