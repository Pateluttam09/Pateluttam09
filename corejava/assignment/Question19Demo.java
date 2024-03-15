package com.assignment;

import java.util.ArrayList;

//WAP to iterate through all elements in an array list.


public class Question19Demo 
{
  public static void main(String[] args) 
  {
	// create a list and add some colors to the list
	  ArrayList<String> list_Strings = new ArrayList();
	  list_Strings.add("red");
	  list_Strings.add("Green");
	  list_Strings.add("Orange");
	  list_Strings.add("white");
	  list_Strings.add("black");
	  System.out.println("Arrayilst: "+list_Strings);
	  // print the list
	  for (String element : list_Strings)
	  {
		  System.out.println(element);
	  }
}
}
