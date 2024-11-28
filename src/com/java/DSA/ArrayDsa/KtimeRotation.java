package com.java.DSA.ArrayDsa;

import java.util.Scanner;

public class KtimeRotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your array size : ");
		int n = sc.nextInt(); // Size of array;

		int arr[] = new int[n];
		System.out.print("Enter your array element : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

 		System.out.print("Enter your K-th element : ");
		int k = sc.nextInt();
		k = k % n;
		for (int a = 0; a < k; a++) {
			int temp = arr[0];
			for (int i = 0; i < n - 1; i++) {
				arr[i] = arr[i + 1];
			}

			arr[n - 1] = temp;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
