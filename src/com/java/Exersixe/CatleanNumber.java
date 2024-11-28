package com.java.Exersixe;

import java.util.Scanner;

public class CatleanNumber {
	public static int fact(int n) {
		int ans = 1;
		
		for( int i=2;i<=n;i++) {
			ans*=i;
		}
		return ans;
	}
	
	public static int catlean(int n) {
		int cat = fact(2*n) / (fact(n) *fact(n+1));
		return cat;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input : ");
		int n = sc.nextInt();
		System.out.println(catlean(n));
}
}
