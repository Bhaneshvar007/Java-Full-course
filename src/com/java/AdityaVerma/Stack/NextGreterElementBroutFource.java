package com.java.AdityaVerma.Stack;

import java.util.*;
public class NextGreterElementBroutFource {
    public static void nge(int arr[] , int n) {
    	int ans[] = new int[n];
    	ans[n-1] = -1;
    	for(int i=0;i<n-1;i++) {
    		ans[i] = -1;
    		for(int j=i+1;j<n;j++) {
    			if(arr[i]<arr[j]) {
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
		System.out.println("Enter the length of the array : ");
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		nge(arr,n);
	}
}
