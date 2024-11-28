package com.java.Exersixe;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		while (true) {
			int Bi = sc.nextInt();
			int num = Bi, d = 0, i = 0;
			while (num != 0) {
				int rem = num % 10;
				num = num / 10;
				d =d + rem *(int) Math.pow(2, i++);
			}
			System.out.println(d);
		}
	}
}
