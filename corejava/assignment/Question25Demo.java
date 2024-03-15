package com.assignment;
abstract class parent 
{
	public abstract void message();
	
}
 
 class FirstSubclass extends parent
{
	 public void message()
	 {
		 System.out.println("this is first subclass");
	 }
}
 class SecondSubclass extends parent
 {
	   public void message()
	   {
		   System.out.println("this is second subclass");
	   }
   }
public class Question25Demo 
{
  public static void main(String[] args) 
  {
	  parent obj1 = new FirstSubclass();
	  
	  parent obj2 = new SecondSubclass();
	  
	  
	  obj1.message();
	  
	  obj2.message();
	  
}
}
