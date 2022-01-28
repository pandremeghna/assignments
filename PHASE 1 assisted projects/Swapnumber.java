package com.pandremeghna.mphasis;

import java.util.Scanner;

public class SwapNumber {
	public static void main(String [] args) {
		int a, b;
		Scanner theValue = new Scanner(System.in);
		System.out.println("Enter Two Number");
		
		a = theValue.nextInt();
		b = theValue.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;
				
		System.out.println("Value of a is: " + a);
		System.out.println("Value of b is: " + b);
	}
}