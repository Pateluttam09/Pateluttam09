package com.assignment;

import java.util.Scanner;

//W.A.J.P. to create a custom exception if Customer withdraw amount which is greater than account balance then program will show custom exception otherwise amount will deduct from account balance. Account balance is:2000 Enter withdraw amount:2500 Sorry, insufficient balance, you need more 500 Rs.To perform this transaction


class uttamexception extends Exception
{
	double amount;
	public uttamexception(double amount)
	{
		this.amount=amount;
		
	
	}
}
class ATM
{
	double balance;
	public void deposit(double amount)
	{
		balance=balance+amount;
		System.out.println(amount+"rs deposited...");
	}
	public void Withdrawal(double amount) throws uttamexception
	{
		if(amount<=balance)
		{
			balance=balance-amount;
			System.out.println(amount+"rs withdrawal successfully...");
			
		}
		else
		{
			double needs=amount-balance;
			throw new uttamexception(needs);
			
		}
	}
}
public class Question27Demo 
{
public static void main(String[] args) 
{
	ATM a1=new ATM();
	
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter amount for deposit...");
	double amount=sc.nextDouble();
	
	
	a1.deposit(amount);
	System.out.println("Enter amount for withdrawal...");
	amount=sc.nextDouble();
	
	
	try
	{
		 a1.Withdrawal(amount);
		 
	}
	
	catch (uttamexception e)
	{
		System.out.println("if you enter"+e.amount+"rs more into your account then you withdrawal"+amount+"rs..");
		
	}
  }
}
