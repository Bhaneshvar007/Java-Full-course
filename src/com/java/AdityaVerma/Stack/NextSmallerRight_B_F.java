package com.java.AdityaVerma.Stack;

public class NextSmallerRight_B_F {
public static void main(String[] args) {
	int arr[] = {4 ,5,1,2,6 ,3};
	int n = arr.length;
	int ans[] = new int[n];
	ans[n-1] = -1;
	for(int i=0;i<n-1;i++) {
		ans[i] = -1;
		for(int j=i+1;j<n;j++) {
			if(arr[i] > arr[j]) {
				ans[i] = arr[j];
				break;
			}
		}
	}
	 
	for(int i=0;i<n;i++) {
		System.out.print(ans[i]  +" ");
	}
}
}
