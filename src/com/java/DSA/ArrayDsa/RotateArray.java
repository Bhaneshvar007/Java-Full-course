package com.java.DSA.ArrayDsa;

import java.util.Scanner;

public class RotateArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your array size : ");
	int n = sc.nextInt(); // Size of array;

	int arr[] = new int[n];
	System.out.print("Enter your array element : ");
	for (int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
	}
	
	for(int i=0;i<n/2;i++) {
		int temp=arr[i];
		arr[i]=arr[n-i-1];
		arr[n-i-1]=temp;
	}
	System.out.print("Sorted array is  : ");

	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+ " ");
	}
}
}
