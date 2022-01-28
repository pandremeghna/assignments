package com.pandremeghna.mphasis;

import java.util.Scanner;

public class SumOfNumber {
	public static void main(String [] args) {
		int sum = 0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int index = 0; index < num; index++) {
			sum = sum + index;
		}
		
		System.out.println("Sum of number is: " + sum);
	}
}