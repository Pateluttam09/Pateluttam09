package com.assignment;
/*
     *
    ***
   *****
    ***
     *
 */

public class Question7Demo4
{
  public static void main(String[] args) 
  {
	int i,j,k;
	int n=3;
	
	for(i=1;i<=n;i+=2)
	{
		for(k=i;k<=n;k+=2)
		{
	   System.out.println(" ");	
	}
	for(j=1;j<=i;j++)
	{
		System.out.println("*");
	}
	System.out.println();
    }
        for(i=n-(n-i);i>=1;i-=2)
  {
	  for(k=i;k<=n;k+=2)
	  {
		  System.out.println(" ");
	  }
	  for(j=1;j<=i;j++)
	  {
		  System.out.println("*");
	  }
	  System.out.println();
      }
    }
  }
