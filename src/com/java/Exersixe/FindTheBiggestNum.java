package com.java.Exersixe;

import java.util.Scanner;

public class FindTheBiggestNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first Number : ");
		int a = sc.nextInt();

		System.out.print("Enter secound Number : ");
		int b = sc.nextInt();

		System.out.print("Enter third Number : ");
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("Bigest number is a : " + a);
		}
		
		else if (b > a && b > c) {
			System.out.println("Bigest number is b : " + b);
		}
		
		else {
			System.out.println("Bigest number is c : " + c);
		}
		
	}
}
