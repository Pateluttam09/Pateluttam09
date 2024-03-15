package com.assignment;

public class Question7Demo2
{
     public static void main(String[] args)
     {
		int i,j;
		int n=5;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<i;j++)
			{
				for(j=1;i<=n;i++)
				{
					int sum=i+j;
					if(sum%2==0)
					{
				System.out.print("1 ");
					}
					else
					{
					  System.out.println();
					}
				}
				System.out.println();
			}
		}
	}
}
