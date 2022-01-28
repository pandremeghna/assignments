package com.pandremeghna.mphasis;

import java.util.Scanner;

public class PowerOfTwo {
   public static void main() {
	   Scanner sc = new Scanner(System.in);
	   int number = sc.nextInt();
	   sc.close();
	   
	   if(isPowerOfTwo(number)) {
		   System.out.println("Yes");
	   }
	   else {
		   System.out.println("No");
	   }
   }
   
   public static boolean isPowerOfTwo(int number) {
	   
	   if(number % 2 != 0) {
		   return false;
	   }
	   else {
		   for(int i = 0; i <= number; i++) {
			   if(Math.pow(2,i) == number) return true;
		   }
	   }
	   return false;
   }
}

