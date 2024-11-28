package com.java.Exersixe.LeetCodeProblem;

// Calculate number of 1 bits in there given String.

import java.util.Scanner;

public class Problem191 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("numnber : ");
		int num = sc.nextInt();

		String str = Integer.toBinaryString(num);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
