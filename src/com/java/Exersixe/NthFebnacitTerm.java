package com.java.Exersixe;

import java.util.*;

public class NthFebnacitTerm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int k = sc.nextInt();
		int a = 0, b = 1, c = 0;
		k--;
		while (k != 0) {
			c = a + b;
			a = b;
			b = c;
			k--;
		}

		System.out.println(c);
	}
}
