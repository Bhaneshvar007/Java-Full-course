package com.java.DSA.ArrayDsa;

import java.util.Scanner;

public class MissingNumberArr {
	public static int missingNumber(int[] nums) {
		int n = nums.length;
		int SumNum = (n * (n + 1)) / 2;
		int missingNum, arrSum = 0;
		
		for (int i = 0; i < n; i++) {
			arrSum += nums[i];
		}
		missingNum = SumNum - arrSum;

		return missingNum;
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

		System.out.println("Missing number is : " + missingNumber(arr));
	}

}
