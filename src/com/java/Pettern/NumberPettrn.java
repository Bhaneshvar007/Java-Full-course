package com.java.Pettern;

import java.util.Scanner;

public class NumberPettrn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number is : ");
		int n = sc.nextInt();
		int count=0;

		for (int i = 0; i <= n; i++) {
			for (int j = n - i; j >= 0; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				count=count+1;
				if(count<10) {
					System.out.print(" ");
				}
				System.out.print(count + " ");
			}
			System.out.println();

		}
//		for (int i = n-1; i >= 0; i--) {
//			for (int j = n - i; j >= 0; j--) {
//				System.out.print(" ");
//			}
//
//			for (int j = 0; j <= i; j++) {
//				count++;
//				System.out.print(count + " ");
//			}
//			System.out.println();
//
//		}
	}
}
