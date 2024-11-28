package com.java.AdityaVerma.BinarySearch;

import java.util.Scanner;

public class CountOfAnNumber {
	public static int[] occ(int arr[], int n, int target) {
		int tempArr[] = new int[2];
		int ans = 0, temp = 0;
		int left = 0, right = n - 1;
		int mid = 0;
		while (left <= right) {
			mid = left + (right-left)/ 2;
			if (target == arr[mid]) {
				temp = mid;
				right = mid - 1;
			} else if (target < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		tempArr[0] = temp;
		left = 0;
		right = n - 1;
		while (left <= right) {
			mid = left + (right-left)/ 2;
			if (target == arr[mid]) {
				temp = mid;
				left = mid + 1;
			} else if (target < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		tempArr[1] = temp;
		return tempArr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements of array : ");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the searching element : ");
		int el = sc.nextInt();

		int[] res = occ(arr, n, el);
		System.out.println(res[1] - res[0] + 1);
	}
}
