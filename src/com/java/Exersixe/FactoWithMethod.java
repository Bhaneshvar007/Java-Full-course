package com.java.Exersixe;

import java.util.*;

public class FactoWithMethod {

	public long facto(long n) {
		long ans = 1;
		for (int i = 2; i <= n; i++) {
			ans *= i;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		long n = sc.nextLong();
		FactoWithMethod obj = new FactoWithMethod();
		System.out.println("The number " + n + " facto is " + obj.facto(n));

	}
}
