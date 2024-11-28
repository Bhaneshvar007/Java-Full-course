package com.java.Exersixe;

import java.util.Scanner;

// Consecutive String Count : Count maximum repatation in given string ex . 101111001 output is 4

public class ConsecutiveStringCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input string : ");
		String s = sc.next();
		int max = 0, cur = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				cur++;
			} else {
				max = Math.max(max, cur);
				cur = 0;
			}
		}
		max = Math.max(max, cur);
		System.out.println("Maximum Consecutive String Count : " + max);

	}

}
