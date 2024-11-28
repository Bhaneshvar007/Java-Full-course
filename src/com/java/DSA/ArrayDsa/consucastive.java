package com.java.DSA.ArrayDsa;

import java.util.Scanner;

public class consucastive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your array size : ");
		int n = sc.nextInt(); // Size of array;

		int arr[] = new int[n];
		System.out.print("Enter your array element : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int curMax = 0, max = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 1) {
				curMax++;
			} else {
				max = Math.max(max, curMax);
				curMax = 0;
			}
		}
		max = Math.max(max, curMax);
		System.out.println(max);
	}
}
