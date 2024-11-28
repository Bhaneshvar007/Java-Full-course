package com.java.Pettern;

public class Peramide {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i <= n; i++) {
			for (int j = n - i; j >= 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		// Second way to print pattern
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= 1; j--) {
 				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print(" *");
				}

			}
			System.out.println();
		}
	}
}
