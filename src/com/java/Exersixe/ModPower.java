package com.java.Exersixe;

import java.util.Scanner;

public class ModPower {
	public static long modPow(long n, long p, long m) {
		long ans = 1;
		while (p-- > 0) {
			ans = (ans * n) % m;
		}

		return ans % m;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input ");
		long n = sc.nextLong();
		long p = sc.nextLong();
		long m = 1000000007;
		System.out.println(modPow(n, p, m));
	}
}
