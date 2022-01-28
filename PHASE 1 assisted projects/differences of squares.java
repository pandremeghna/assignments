
package com.pandremeghna.mphasis;

import java.util.Scanner;

public class DifferenceOfSquare
{
	int sum, sqsum;
	public int calculateDifference(int n) {
		for(int i=1; i<=n; i++) {
			sum+= i;
		}
		sum = sum * sum;
		for(int j=1; j<=n; j++) {
			sqsum = sqsum + (j * j);
		}
		return sqsum-sum;
	}

public static void main(String [] args) {
	DifferenceOfSquare s = new DifferenceOfSquare();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();
	
	System.out.println(s.calculateDifference(n));
}
}