package com.assignment;
//WAP to create one thread by implementing Runnable interface in class.


class t1 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("thread is running");
	}
}

public class Question17Demo 
{
   public static void main(String[] args) 
   {
	 t1 obj1 = new t1();
	 Thread t =new Thread(obj1);
	 t.start();
   }
   
}

