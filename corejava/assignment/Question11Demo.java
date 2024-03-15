package com.assignment;

import java.lang.reflect.Array;

//WAP to find index of an array element.
public class Question11Demo 
 {
    public static void main(String[] args, int elementTofind) 
    {
		int[] array = {10, 20, 43, 64, 59};
		
		
		int index = 0;
		
		for (int i =0; i < array.length; i++) {
			if(array[i] == elementTofind) {
				index = i;
				break;
				
			}
		}
		
		if (index !=0)
		{
		   System.out.println("index of" + elementTofind +" is: " + index);
	}
		else
		{
			System.out.println("Element not found in the array. ");
		}
    }	
}
