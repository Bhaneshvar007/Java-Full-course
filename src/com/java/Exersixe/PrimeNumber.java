package com.java.Exersixe;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.print("Enter any number : ");
			int n = sc.nextInt();
			int temp = 0, i;
			for (i = 2; i < n - 1; i++) {

				if (n % i == 0) {
					temp += 1;
				}
			}

			if (temp > 0)
			{
				System.out.println("Not a Prime Number");
			}

			else {
				System.out.println("Prime Number");
			}
		}
	}
}
