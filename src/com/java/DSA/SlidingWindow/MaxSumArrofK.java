package com.java.DSA.SlidingWindow;

import java.util.Scanner;

public class MaxSumArrofK {
	public static int Product(int[] nums,int k) {
		int sum=0;
	
 		for (int i = 0; i < k; i++) {
 			sum+=nums[i];
		 
	}
 		int ans=sum;
 		
 		for(int i=k;i<nums.length;i++) {
 			sum-=nums[i-k];
 			sum+=nums[i];
 			ans=Math.max(ans, sum);
 		}
 		return ans;
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
		System.out.print("Enter your window size : ");
		int k=sc.nextInt();

		System.out.println(Product(arr , k));
	}
}
