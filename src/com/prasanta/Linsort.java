package com.prasanta;

import java.io.*;

class sort
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
      }
                 
      public void  LinSort()
      {
            System.out.println("=====LINEAR SORT=====\n");
            getdata();
                for(int i=0;i<size;i++)
                    {
                  for(int j=i+1;j<size;j++)
                      {
                         if(sortArr[i] > sortArr[j])
                          {
                               int temp=sortArr[i];
                               sortArr[i]=sortArr[j];
                               sortArr[j]=temp;
                          }
                     }
                  }
            display();
        }    

    public void display()
    {
         System.out.println("\nAfter Sorting");
         for(int i=0;i<size;i++)
              System.out.println(sortArr[i]);
    }
}


class LinSort 
{
    public static void main(String args[]) 
    {
          sort ob1=new sort();
          ob1.LinSort();
    }
}