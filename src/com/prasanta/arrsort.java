package com.prasanta;

class arrsort
{
	public static void main(String[] args) 
	{
		int number[]={7,3,8,10,2};
		int i,j;
		System.out.println("Before Sorting The Array Elements Are ");
		for(i=0;i<number.length;i++)
		{
			System.out.println(number[i]);
		}
		for(i=0;i<number.length;i++)
		{
			for(j=i+1;j<number.length;j++)
			{
				if(number[i]>number[j])
				{
					int temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
		}
		System.out.println("After Sorting The Array Elements Are ");
		for(i=0;i<number.length;i++)
		{
			System.out.println(number[i]);
		}
	}
}
