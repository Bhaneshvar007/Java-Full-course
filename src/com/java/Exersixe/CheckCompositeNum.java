package com.java.Exersixe;

import java.util.Scanner;

public class CheckCompositeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Enter the number : ");
			int n = sc.nextInt();
			int temp = 0;
			for (int i = 2; i < n - 1; i++) {
				if (n % i == 0) {
					temp += 1;
				}
			}

			
			if (temp > 0) {
				System.out.println("Composite number");
			} else {
				System.out.println("not a Composite number");
			}
		}
	}
}