package com.assignment;

import java.util.Scanner;

public class Question5Demo 
{
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = scanner.nextInt();
	int OriginalNumber, remainder , result = 0, n = 0;
	
	
	OriginalNumber = number;
	
	//count number of digits
	for (OriginalNumber = number; OriginalNumber != 0; OriginalNumber /= 10, ++n);
	OriginalNumber = number;
	
	// calculate the result
	while (OriginalNumber != 0) {
		remainder = OriginalNumber % 10;
		result += Math.pow(remainder, n);
		OriginalNumber /= 10;
	}
	
	// check if number is armstrong
	if (result == number)
		System.out.println(number + " is an armstrong number.");
	else
		System.out.println(number + " is not an armstrong number.");
	
  }
}
