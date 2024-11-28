package com.java.Exersixe;

import java.util.Scanner;

public class NearestPowerOf3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num = sc.nextInt();

		while (num != 0) {
			if (Math.cbrt(num) == (int) (Math.cbrt(num))) {
				System.out.println(num);
				break;
			}

			else {
				num--;
			}

		}
	}
}
