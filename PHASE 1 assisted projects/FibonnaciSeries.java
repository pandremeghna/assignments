package com.pandremeghna.mphasis;

public class FibonnaciSeries {
	public static void main(String [] args) {
		
		int a = 13, firstNumber = 0, secondNumber = 1;
		System.out.println("Fibonnaci Series " + a + " terms: ");
		
		for(int i = 1; i <= a; i++) {
			System.out.println(firstNumber + " ");
			int nextNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = nextNumber;
		}
	}
}