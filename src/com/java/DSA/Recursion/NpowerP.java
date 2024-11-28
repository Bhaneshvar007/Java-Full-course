package com.java.DSA.Recursion;

public class NpowerP {

	public static int power(int n, int p) {
		if (p == 0)
			return 1;
		return n * power(n, p - 1);
	}

	public static void main(String[] args) {
		System.out.println(power(10, 10));
	}
}