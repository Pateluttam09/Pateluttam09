package com.assignment;
// W.A.J.P to find factorial for given number.
public class Question3Demo
{
 public static void main(String[] args)
   {
	 int num=7;
	 long factorial = num;
	 for(int i=1;i<=num;i++)
	 {
		 factorial=factorial*i;
	 }
	 System.out.println("the factorial of "+num+" is "+factorial);
	 
    }
 }
