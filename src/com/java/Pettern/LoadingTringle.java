package com.java.Pettern;

public class LoadingTringle {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 0; i <= n-1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}

			int spc = 2 * (n - i);
			for (int j = 1; j <= spc; j++) {
				System.out.print("B ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			System.out.println(); 
		}

		for (int i = n; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}

			int spc = 2 * (n - i);
			for (int j = 1; j <= spc; j++) {
				System.out.print("B ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}
