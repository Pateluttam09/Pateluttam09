package com.assignment;
//WAP to update specific array element by given element.

import java.util.ArrayList;

public class Question20Demo 
{
       public static void main(String[] args) 
       {
		
    	   ArrayList<String> list_Strings = new ArrayList();
    		  list_Strings.add("red");
    		  list_Strings.add("Green");
    		  list_Strings.add("Orange");
    		  list_Strings.add("white");
    		  list_Strings.add("black");
    		  System.out.println("Arraylist: "+list_Strings);
    		  list_Strings.set(0, "Grey");
    		  list_Strings.set(3, "Blue");
    		  System.out.println("New Arraylist: "+list_Strings);
	}
}
