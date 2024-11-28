package com.java.Exersixe;

import java.util.Scanner;

public class NearsetPowerOf2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number : ");
		int n = sc.nextInt();
		while (n != 0) {
			if ((n & (n - 1)) == 0) {
				System.out.println(n);
				break;
			} else {
				n--;
			}
		}
	}
}
