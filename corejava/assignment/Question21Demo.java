package com.assignment;
//WAP to remove the third element from a array list.
import java.util.ArrayList;

public class Question21Demo 
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
		  list_Strings.remove(2);
		  System.out.println("New arraylist: "+list_Strings);
	}
}
