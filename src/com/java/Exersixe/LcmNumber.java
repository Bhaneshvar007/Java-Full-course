package com.java.Exersixe;

import java.util.Scanner;

public class LcmNumber {

// less time complexity

	public static int lcm(int num1, int num2) {
		int i = Math.min(num1, num2);
		while (i > 0) {
			if (num1 % i == 0 && num2 % i == 0) {
				return (num1 * num2) / i;
			}
			i--;
		}
		return 1;
	}

	// more time complexity

	public static void lcm1(int num1, int num2) {
		int gcd = 1;

		for (int i = 1; i <= num1 && i <= num2; ++i) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}

		int lcm = (num1 * num2) / gcd;
		System.out.println(lcm);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		int num2 = sc.nextInt();
		
		System.out.println(lcm(num1, num2));
		
		lcm1(num1, num2);
	}
}
