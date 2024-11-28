package com.java.Pettern;

import java.util.Scanner;

public class ButterFly {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter fab series : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("+ ");
			}
			int spc = 2 * (num - i);
			for (int j = 1; j <= spc; j++) {
				System.out.print("*  ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("+ ");
			}
			System.out.println();
		}

		for (int i = num - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("+ ");
			}
			int spc = 2 * (num - i);
			for (int j = 1; j <= spc; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("+ ");
			}
			System.out.println();
		}
	}
}
