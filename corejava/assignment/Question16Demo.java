package com.assignment;
//WAP to deemonstrate mutiple cath blocks.

public class Question16Demo 
{
      public static void main(String[] args) {
		
    	  try {
    		  String s=null;
    				  System.out.println(s.length());
    		   }
    	  catch(ArithmeticException e)
    	  {
    		  System.out.println("Arithmetic Exeption occurs");
    	  }
    	  catch(ArrayIndexOutOfBoundsException e)
    			  {
    		  System.out.println("parent Exception occurs");
    			  }
    	  System.out.println("rest of the code");
	}
}
