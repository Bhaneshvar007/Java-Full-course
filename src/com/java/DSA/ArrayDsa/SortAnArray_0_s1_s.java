package com.java.DSA.ArrayDsa;

import java.util.Scanner;

public class SortAnArray_0_s1_s {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your array size : ");
		int n = sc.nextInt(); // Size of array;

		int arr[] = new int[n];
		System.out.print("Enter your array element : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Printing Unsorted arr : ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int zero = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zero++;
			}
		}
		System.out.print("Printing Unsorted arr : ");
		for (int i = 0; i < arr.length; i++) {
			if (zero > 0) {	
				arr[i] = 0;
				zero--;
			}
			else {
				arr[i] = 1;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
