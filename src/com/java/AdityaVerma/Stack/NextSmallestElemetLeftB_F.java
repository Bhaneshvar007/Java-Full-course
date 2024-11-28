package com.java.AdityaVerma.Stack;

public class NextSmallestElemetLeftB_F {
public static void main(String[] args) {
	int arr[] = { 4,5,2,10,8};
	int n = arr.length;
	int ans[] = new int[n];
	ans[0]=-1;
	for(int i=0;i<n;i++) {
		ans[i] = -1;
		for(int j=i-1;j>=0;j--) {
			if(arr[i] > arr[j]) { // check array left is element is smaller or not.
				ans[i] = arr[j];
				break;
			}
		}
	}
	
	for(int i=0;i<n;i++) {
		System.out.print(ans[i] + " ");
		
	}
}
}
