package com.java.Pettern;

public class RightTrangle {
	public static void main(String[] args) {
		
		// Right Up to low
		int c=0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				c=c+1;
				System.out.print(c +" ");
			}
			System.out.println(" ");
		}
		
		// Right lower to uppe
		
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
//
	}
}
