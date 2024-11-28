package com.java.Exersixe;

import java.util.Arrays;
import java.util.Scanner;

public class sortStr {

	public static String SortString(String s1) {
		String s = s1.replaceAll("[^a-zA-Z]", "");
		char[] chArr = s.toCharArray();
		Arrays.sort(chArr);
		return new String(chArr);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number : ");
		String str = sc.nextLine().toLowerCase();
		System.out.println(SortString(str));

	}
}
