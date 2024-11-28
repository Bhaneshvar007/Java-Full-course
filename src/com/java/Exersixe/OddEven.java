package com.java.Exersixe;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the any number : ");
			int n = sc.nextInt();
			if (n % 2 == 0) {
				System.out.println("Even Number");
			}

			else {
				System.out.println("Odd Number");
			}
		}
	}
}
