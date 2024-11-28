package com.java.DSA.ArrayDsa;

import java.util.Scanner;

public class Sub_Arras{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your array size : ");
		int n = sc.nextInt(); // Size of array;

		// Sub string for char.

		// char arr[] = new char[n];
		// System.out.print("Enter your array element : ");
		// for (int i = 0; i < n; i++) {
		// arr[i] = sc.next().charAt(0);
		// }

		// Sub string for Integer.

		int arr[] = new int[n];
		System.out.print("Enter your array element : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Printing an array element : ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " | ");
		}
		System.out.println();

		
		
// print sub array

//		for (int i = 0; i < arr.length; i++) { // Sticky array
//			for (int j = i; j < arr.length; j++) { // Moving array
//				int sum=0;
//				for (int k = i; k <= j; k++) { // Printing array
//	 				System.out.print(arr[k]);
//				}
// 				System.out.println();
// 			}
//			System.out.println("❌❌❌❌❌❌❌❌❌❌");
//		}

		
		
		
		// calculate sum of all rows(1->1 1,2->3,1,2,3->6.....

//		for (int i = 0; i < arr.length; i++) { // Sticky array
//			for (int j = i; j < arr.length; j++) { // Moving array
//				int sum=0;
//				for (int k = i; k <= j; k++) { // Printing array
//					sum+=arr[k];
//				}
//				System.out.println(sum);
//			}
//			System.out.println("❌❌❌❌❌❌❌❌❌❌");
//		}

		
		
		
		// calculate sum of all rows(1->1 1,2->3,1,2,3->6.....
//		for (int i = 0; i < arr.length; i++) { // Sticky array
//			int sum = 0;
//			for (int j = i; j < arr.length; j++) { // Moving array
//				sum += arr[j];
//				System.out.println(sum);
//			}
//			System.out.println();
//		}
//		System.out.println("❌❌❌❌❌❌❌❌❌❌");
		
		
		
		
		// Find maximum total sum.
		int max=0;
		for (int i = 0; i < arr.length; i++) { // Sticky array
			int sum = 0;
			for (int j = i; j < arr.length; j++) { // Moving array
				sum += arr[j];
				if(max<sum) {
					max=sum;
				}
				
//				max=Math.max(max, sum);
			}
  		}
		System.out.println("The maximum num is : " + max);
 	}
}
