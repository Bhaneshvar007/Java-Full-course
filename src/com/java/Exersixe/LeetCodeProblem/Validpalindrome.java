package com.java.Exersixe.LeetCodeProblem;

import java.util.Scanner;

// valid palindrome for example I/P:> "race > a car" first we have remove all those spacial char and spaces than chat it string are palindrome are not. 

public class Validpalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input string : ");
		String str = sc.nextLine();

		// Remove all the sapce and spacial charecter in the given string and convert to
		// lower case;

		str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

		String str2 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			str2 += str.charAt(i);
		}
		System.out.println(str2);
		if (str.equals(str2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}
}
