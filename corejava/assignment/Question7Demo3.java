package com.assignment;
/*
    1
   2 2
  3 3 3
 4 4 4 4 
 */
public class Question7Demo3 
{
     public static void main(String[] args) 
     {
		int n=4;
		int i,j,k;

		for(i=1;i<=n;i++)
		{
			for(k=i;k<=n;k++)
			{
			 System.out.println(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.println(i+" ");
			}
			System.out.println();
		 }
	 }
  }
