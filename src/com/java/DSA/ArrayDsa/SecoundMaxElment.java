package com.java.DSA.ArrayDsa;

public class SecoundMaxElment {
	public static void main(String[] args) {
		int arr[] = { 4,4,4,4,4,4 };
		int secMax = 0;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				secMax = max;
				max = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>secMax&&arr[i]!=max) {
				arr[i]=secMax;
			}
		}
		System.out.println(secMax);

	}
}
