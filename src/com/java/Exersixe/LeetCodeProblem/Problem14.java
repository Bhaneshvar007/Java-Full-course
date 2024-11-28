package com.java.Exersixe.LeetCodeProblem;

// Longest Common Prefix;

import java.util.Scanner;

public class Problem14 {

	public static void LongComPre(String s1, String s2, String s3) {
		int n = Math.min(Math.min(s1.length(), s2.length()), s3.length());
		String Temp = "";
		for (int i = 0; i < n; i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				Temp += s1.charAt(i);
			}
		}
		System.out.println(Temp + " : is the common prefix string");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input : ");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String str3 = sc.nextLine();
 		LongComPre(str1, str2, str3);
	}
}
