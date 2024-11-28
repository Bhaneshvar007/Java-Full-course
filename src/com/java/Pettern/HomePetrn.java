package com.java.Pettern;

public class HomePetrn {
	public static void main(String[] args) {
		int n = 6;
		for (int i = 1; i <= n; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" *  ");
			}
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == n || j == 1 || j == n) {
					System.out.print(" *  ");
				} else {
					System.out.print("    ");
				}
			}

			System.out.println();
		}
	}
}
