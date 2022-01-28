package com.pandremeghna.mphasis;

import java.util.Scanner;

public class TrafficLight {
	public static void main(String [] args) {
		System.out.println("Enter the value");
		
		String user = new Scanner(System.in).nextLine();
		switch(user) {
		case "Red":
			System.out.println("Stop");
			break;
		
		case "Yellow":
			System.out.println("Ready");
			break;
		
		case "Green":
			System.out.println("Go");
			break;
			
		default:
			System.out.println("Something went wrong");
		}
	}
}