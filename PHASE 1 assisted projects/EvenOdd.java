package com.pandremeghna.mphasis;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String [] args) {
		Scanner theValue = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num;
		num = theValue.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Given number is Even");
		}
		else {
			System.out.println("Given number is Odd");
		}
		
	}

}