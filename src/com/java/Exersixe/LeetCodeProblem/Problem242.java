package com.java.Exersixe.LeetCodeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class Problem242 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input string : ");
		String s = sc.next();
		String t = sc.next();

		if (s.length() == t.length()) {
			char sArr[] = s.toCharArray();
			Arrays.sort(sArr);

			char tArr[] = t.toCharArray();
			Arrays.sort(tArr);

			boolean check = false;

			for (int i = 0; i < s.length(); i++) {
				if (sArr[i] == tArr[i]) {
					check = true;
				}
			}

			if (check == true) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}

		else {
			System.out.println(false);
		}
	}
}
