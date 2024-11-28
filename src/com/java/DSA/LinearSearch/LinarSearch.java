package com.java.DSA.LinearSearch;

import java.util.Scanner;

public class LinarSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your array size : ");
		int n = sc.nextInt(); // Size of array;

		int arr[] = new int[n];
		System.out.print("Enter your array element : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Printing an array element : ");
		for(int i=0;i<n;i++) {
			 System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("Enter search Element : ");
		int searEl = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (searEl == arr[i]) {
				System.out.println(i);
			}
			else {
				System.out.println("Element not present in that array");
				break;
			}
		}
	}
}
