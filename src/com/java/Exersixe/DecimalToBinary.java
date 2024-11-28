package com.java.Exersixe;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter decimal number : ");
		int num = sc.nextInt();
		int temp = num;
		String s = "";

		while (temp != 0) {
			int rem = temp % 2;
			s = s + rem;
			temp = temp / 2;
		}
		System.out.println(s);

	}
}
