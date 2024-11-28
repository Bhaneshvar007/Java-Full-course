package com.java.Exersixe;

import java.util.Scanner;

public class BreakTheNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any number : ");
		while (true) {
			int n = sc.nextInt();
			
			if(n==42) {
				System.out.println("Break the code");
				break;
				
			}
			System.out.println(n);
			
		}

	}
}
