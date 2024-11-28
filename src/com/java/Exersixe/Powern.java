package com.java.Exersixe;

import java.util.*;

public class Powern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number(n) : ");
		int n = sc.nextInt();
		System.out.print("Enter any number(p) : ");
		int p = sc.nextInt();
		int ans = 1;
		while (p > 0 ) {
			ans *= n;
			p--;
		}
		System.out.println(ans);
	}
}
