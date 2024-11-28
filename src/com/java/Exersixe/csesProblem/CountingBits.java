package com.java.Exersixe.csesProblem;

import java.util.Scanner;

public class CountingBits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			int num = i;
			while (num > 0) {
				count += num & 1; // take the binary number for the num & 1;
				num /= 2;  // Eske jagah par num>>=1; ka bhi use kar sakte hai
//				num>>=1;
			}
		}
		System.out.println(count);
	}
}
