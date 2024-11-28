package com.java.DSA.ArrayDsa;

import java.util.Scanner;

public class LongestSubarrayOdd {
	
	public static void LongestOddSum(int arr[],  int n){
	
		
		int temp=0;
		for(int i=0;i<n;i++) {
			if((arr[i]%2!=0)) {
				temp++;	
				break;
			}
		}
		if(temp%2!=0) {
			System.out.println(n);
		}
		
		else {
			int left=0, right=0;
			for(int i=0;i<n;i++) {
				if(arr[i]%2==1) {
					left=i;
					break;
				}
			}
			
			for(int i=n-1;i>=0;i--) {
				right=i;
				break;
			}
			int ans = Math.max((n-left-1),right);
			System.out.println("Longest Subarray Odd is : " +ans);
		}
		
 	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your array size : ");
	int n = sc.nextInt(); // Size of array;

	int arr[] = new int[n];
	System.out.print("Enter your array element : ");
	for (int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
	}
	LongestOddSum(arr,n);
	
}
}
