package com.java.DSA.Recursion;

import java.util.Scanner;

public class PrintArrayUsingRcursion {
        static int i=0;
        // Print  an array;
	 	public static void printarr(int[] arr,int n) {
	 		if(n==0) return ;
	 		printarr(arr , n-1);
	 		System.out.print(arr[n-1] + " ");
		}
	 	
 	 	// Sum all array element
	 	public static int printArrSum(int[] arr,int n) {
	 		if(n==0) return n;
 	 		
	 		return arr[n-1] + printArrSum(arr , n-1);
	 	}
	 	
	 	// array product.
	 	public static int printArrPrdt(int[] arr,int n) {
           if(n==1) return n;
 	 		
	 		return arr[n-1] * printArrPrdt(arr , n-1);
	 		
	 	}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("number : ");
			int n = sc.nextInt();
			int arr[]  = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
 			printarr(arr,n);
 			System.out.println("\n Sum of the array : " + printArrSum(arr,n));
 			System.out.print("Product of the array : "+printArrPrdt(arr,n));
 		}
	

}
