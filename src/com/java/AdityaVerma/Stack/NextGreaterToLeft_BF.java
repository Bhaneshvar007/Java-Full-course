package com.java.AdityaVerma.Stack;

import java.util.Scanner;

public class NextGreaterToLeft_BF {
	
	public static void NGL(int arr[] , int n) {
		int ans[] = new int[n];
		ans[0] = -1;
		for(int i=1;i<n;i++) {
			ans[i] = -1;
			for(int j=i-1;j>=0;j--) {
				if(arr[i] < arr[j]) {
					ans[i] = arr[j];
					break;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(ans[i] + " ");
		}
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array length : ");
	int n = sc.nextInt();
	int []arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	NGL(arr,n);
}
}