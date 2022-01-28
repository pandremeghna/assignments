package com.pandremeghna.mphasis;

import java.util.Scanner;

public class IncreasingNumber {
	public static void main(String [] args) {
		int num;
		boolean flag = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		num = sc.nextInt();
		
		int currentDigit = num % 10;
		num = num/10;
		
		while(num > 0) {
			if(currentDigit <= num % 10) {
				flag= true;
			}
			
			currentDigit = num % 10;
			num = num/10;
		}
		
		if(flag) {
			System.out.println("Digits not in increasing Order");
		}
		else {
			System.out.println("Digits are in increasing Order");
		}
	}
}