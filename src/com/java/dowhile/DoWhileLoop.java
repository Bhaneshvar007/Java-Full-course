package com.java.dowhile;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		do {
			System.out.println(i * n);
			i++;
		} while (i <= 10);
	}
}
