package com.java.Exersixe;

import java.util.Scanner;

public class RandomeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
//		int min = 1, max = 100, range = max - min + 1;
		
		while (true) {
			int rand = (int) (Math.random() * 10);
//			int rand = (int) (Math.random() * range) + min;
 			int n = sc.nextInt();
 			if (n == rand) {
				System.out.println("Gaussed");
				break;
			} else {
				System.out.println("Try again");
 			}
		}

	}
}
