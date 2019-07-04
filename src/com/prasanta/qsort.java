package com.prasanta;/*QUICK SORT*/

import java.io.*;

class qsort
{
      String str;
      int size,sortArr[];
	  
	  public void getdata()
	  {
	         System.out.print("Enter how many data you want to enter : ");
			 System.out.flush();
			 try{
			     BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
			     str=obj.readLine();
				 size=Integer.parseInt(str);
				 sortArr=new int[size];
				 for(int i=0;i<size;i++)
				   {
				       System.out.print("Enter element at "+(i+1)+"th position  :  ");
					   System.out.flush();
					   str=obj.readLine();
					   sortArr[i]=Integer.parseInt(str);
				   }
			    }
			catch(Exception e)  {}
			QuickSort(sortArr,0,size-1);
	  }
			     
	  public void  QuickSort(int sortArr[],int lb,int ub)
	  {       
				int i,j,key,flag=0,temp;
				if(lb<ub)
				{
				   i=lb;
				   j=ub+1;
				   key=k[i];
				   while(flag!=1)
				     {
					     i++;
						 while(k[i]<key)
						      i++;
						j--;
						while(k[j]>key)
						      j--;
						if(i<j)
						  {
						      temp=k[i];
							  k[i]=k[j];
							  k[j]=temp;
						   }
						else
						  {
						     flag=1;
							 temp=k[lb];
							 k[lb]=k[j];
							 k[j]=temp;
						  }
					}
				QuickSort(sortArr,lb,j-1);
				QuickSort(sortArr,j+1,ub);
			}
		}

	public void display()
	{
	     System.out.println("\nAfter Sorting");
		 for(int i=0;i<size;i++)
		      System.out.println(sortArr[i]);
    }
}


class QuickSort 
{
	public static void main(String args[]) 
	{
          sort ob1=new sort();
		   System.out.println("=====QUICK SORT=====\n");
			ob1.getdata();
			ob1.display();
	}
}
