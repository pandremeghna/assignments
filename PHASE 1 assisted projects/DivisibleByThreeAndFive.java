package com.pandremeghna.mphasis;

import java.util.Scanner;

public class  DivisibleByThreeAndFive
{
	int a = 0;
	public int calculateSum(int n) {
		for(int index = 0; index <= n; index++) {
			if(index % 3 == 0 || index % 5 == 0) {
				a+= index;
			}
		}
		return a;
}

public static void main(String [] args) {
	    DivisibleByThreeAndFive s1 = new DivisibleByThreeAndFive();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(s1.calculateSum(n));
	}		
}
