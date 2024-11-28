package com.java.DSA.ArrayDsa;

import java.util.Scanner;

public class ProductSubArray {
	// MaximumProduct
	
//	public static int Product(int[] nums) {
//		int prdt = 1, ans = Integer.MIN_VALUE;
//		for (int i = 0; i < nums.length; i++) {
//			prdt *= nums[i];
//			ans = Math.max(ans, prdt);
//			if (prdt == 0)
//				prdt = 1;
//
//		}
//		prdt = 1;
//		for (int i = nums.length - 1; i >= 0; i--) {
//			prdt *= nums[i];
//			ans = Math.max(ans, prdt);
//			if (prdt == 0)
//				prdt = 1;
//
//		}
//		return ans;
//	}
	
	
	
	
	// MinimumProduct
	
	public static int Product(int[] nums) {
		int prdt = 1, ans = nums[0];
		for (int i = 0; i < nums.length; i++) {
			prdt *= nums[i];
			ans = Math.min(ans, prdt);
			if (prdt == 0)
				prdt = 1;
			
		}
		prdt = 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			prdt *= nums[i];
			ans = Math.min(ans, prdt);
			if (prdt == 0)
				prdt = 1;
			
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

		System.out.println(Product(arr));
	}

}
