package com.java.Exersixe;

import java.util.Scanner;

public class NthPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int k = sc.nextInt();
		int num = 2;
		while (k != 0) {
			boolean check = true;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					check = false;
					break;
				}
			}
			if (check == true) {
				k--;
			}
			num++;

		}
		System.out.println(num - 1);
	}

}
