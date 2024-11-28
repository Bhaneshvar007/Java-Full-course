package com.java.AdityaVerma.BinarySearch;

import java.util.Scanner;

// in that problem we don't know given array is increasing order or decreasing order;
// First we have search the array is ace or dsce order.
// for acesnding order we have apply the asc order binary search. (mid < target --> search left )
// for desendin order we have apply the dsce order binary search(mid > target --> search left )

public class OrderNotKnowSearch { 
    // Program for acending order binary element;
	public int asceOrder(int arr[] , int n , int target) {
		if(n == 1) {
 			return n;
		}
		
 		int s = 0 , e = n-1 , m =0;
		while(s<=e) {
			m = s+(e-s)/2;
			if(arr[m]>target) {
				e = m-1;
			}
			else if(arr[m]<target) {
				s = m+1;
			}
			else {
				return m;
			}
		}
		return -1;
	}
	
	// Prograam for dsce order
	
	public int dsceOrder(int arr[] , int n , int target) {
		if(n == 1) {
 			return n;
		}
		
 		int m = 0 , s = 0 , e = n-1;
		while(s<=e) {
			m = s + (e - s ) / 2 ;
			if( arr[m] > target) {
				s = m + 1;
			}
			else if(arr[m] < target) {
				e = m - 1 ;
			}
			else {
				return m;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OrderNotKnowSearch ob = new OrderNotKnowSearch();
		System.out.println("Enter the length of array : ");
		int n = sc.nextInt();
		System.out.println("Enter the element of array : ");
		int arr[]  = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the searching element : ");
		int el = sc.nextInt();
		if(n == 1) {
			System.out.println(arr[0]);
			return;
		}
		if(arr[0] > arr[1]) {
			System.out.println(ob.dsceOrder(arr , n , el));
		}
		
		else {
			System.out.println(ob.asceOrder(arr , n , el));
		}
 	}
}
