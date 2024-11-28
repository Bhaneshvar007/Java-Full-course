package com.java.Exersixe;

import java.util.Scanner;

public class CountAlphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		int a = 0, b = 0, c = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				a++;
			} else if (s.charAt(i) == 'b') {
				b++;
			} else if (s.charAt(i) == 'c') {
				c++;
			}
		}

		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
	}
}
