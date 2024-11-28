package com.java.Exersixe;

import java.util.Scanner;

public class GcdNumber {

	// 1. less complexity
	public static int gcd1(int num1, int num2) {
		int i = Math.min(num1, num2);
		while (i > 0) {
			if (num1 % i == 0 && num2 % i == 0) {
				return i;
			}
			i--;
		}
		return 1;
	}

	
	// 2. less complexity

	public static void gcd2(int num1, int num2) {
		int gcd = 1;
		for (int i = 1; i <= num1 && i <= num2; ++i) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}
	
	// 3. Recursion
	
	public static int gcd3(int a, int b) {
		if(b==0) return a; // base case
		return gcd3(b,a%b); // recursion case
		
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		int num2 = sc.nextInt();
		
		
		

		// First way to find the gcd but time complexity id more
//		gcd2(num1, num2);

		// Secound way to print gcd time complexity less
//		int ans = gcd1(num1, num2);
//		System.out.println(ans);
		
		
		// Using recursion
		System.out.println(gcd3(num1,num2));

	}
}
