package com.java.Exersixe;

import java.util.Scanner;

public class CheckNumberFebo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number");
		int num = sc.nextInt();

		int a = 0, b = 1, c = 0;
		num--;
		while (num != 0) {
			c = a + b;
			a = b;
			b = c;
			num--;
		}
		
 		if (c == 13) {
			System.out.println("Yes");
		}

 		
		else {
			System.out.println("No");
		}
	}
}
