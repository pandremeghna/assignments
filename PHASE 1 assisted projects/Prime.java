package com.pandremeghna.mphasis;

import java.util.Scanner;

public class Prime {
	public static void main(String [] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		a = sc.nextInt();
		System.out.println("Prime numbers are");
		for(int i = 2; i <= a; i++) {
			b = 0;
			for(int j = 2; j <= i; j++) {
				if((i % j) == 0) {
					b = 1;
					break;
				}
				if(b == 0) {
					System.out.println(i);
				}
			}
		}
	}

}