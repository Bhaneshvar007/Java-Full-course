package com.java.DSA.ArrayDsa;

import java.util.Scanner;

public class RoatateArrayElement {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your array size : ");
	int n = sc.nextInt(); // Size of array;

	int arr[] = new int[n];
	System.out.print("Enter your array element : ");
	for (int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
	}

	System.out.println();
	
	
//	int temp = arr[n-1];
	int temp=arr[0];
	
//	for(int i=n-1;i>=1;i--) { // right rotate
		for(int i=0;i<n-1;i++) {//left rotate
//		arr[i]=arr[i-1]; // last,first,sec,third.fourth.....
		arr[i]=arr[i+1]; // Sec,third.fourth.....first
	}
//	arr[0]=temp;
	arr[n-1]=temp;
	
	for(int i=0;i<n;i++) {
 		System.out.print( arr[i] + " ");
	}
	
	 	
}
}
