package com.java.Pettern;

import java.util.Scanner;

public class PalindromePattrn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number : ");
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}

			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			for (int j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
		// for (int i = n-1; i >= 1; i--) {
		// 	for (int j = 1; j <= n - i; j++) {
		// 		System.out.print("  ");
		// 	}

		// 	for (int j = i; j >= 1; j--) {
		// 		System.out.print(j + " ");
		// 	}
		// 	for (int j = 2; j <= i; j++) {
		// 		System.out.print(j + " ");
		// 	}

		// 	System.out.println();
		// }
	}
}
