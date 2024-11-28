package com.java.Exersixe;

import java.util.Scanner;

public class SimpleIntrest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Rate : ");
		int R = sc.nextInt();

		System.out.print("Enter the Price : ");
		int P = sc.nextInt();

		System.out.print("Enter the Time : ");
		float T = sc.nextFloat();
		int Si;

		Si = (int) ((R * P * T) / 100);
		System.out.print("Simple Intrest IS : " + Si);

	}
}
