package com.pandremeghna.mphasis;

import java.util.Scanner;

public class FactioralOfNumber {
	public static void main(String [] args) {
		Scanner theFactorial = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = theFactorial.nextInt();
        int fact = 1;		
		for(int index = 1; index <= num; index++) {
			 fact = fact * index;
		}
		System.out.println("Factorial of number is : " + fact);
	}
}