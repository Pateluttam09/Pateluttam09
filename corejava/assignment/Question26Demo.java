package com.assignment;

import java.util.Scanner;

/*
 W.A.J.P. which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
Marks Grade
91-100 AA
81-90 AB
71-80 BB
61-70 BC
51-60 CD
41-50 DD
<=40 Fail
 */
public class Question26Demo 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your marks: ");
	int mark=sc.nextInt();
	
	if(mark>91 && mark<100)
	{
		System.out.println("your grade is aa");
	}
	if(mark>81 && mark<=90)
	{
		System.out.println("your grade is ab");
	}
	if(mark>71 && mark<=80)
	{
		System.out.println("your grade is bb");
	}
	if(mark>61 && mark<=70)
	{
		System.out.println("your grade is bc");
	}
	if(mark>51 && mark<=60)
	{
		System.out.println("your grade is cd");
	}
	if(mark>41 && mark<=50)
	{
		System.out.println("your grade is cd");
	}
	else
	{
		System.out.println("sorry,you are fail...");
	}
  }
}
