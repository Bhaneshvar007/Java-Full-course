package com.java.AdityaVerma.BinarySearch;

import java.util.Scanner;

public class IncreasingSearch {
  public static int Incresing(int arr[] , int el,int n) {
	  int st = 0 , end = n-1;
	  int mid = 0;
	  while(st<=end) {
		  mid = st + (end - st) / 2; 
		  if(arr[mid] > el) {
			  end = mid-1;
		  }
		  else if(arr[mid]<el){
			  st = mid+1;
		  }
		  else {
			  return mid;
		  }
	  }
	  
	  return -1;
  }
  
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of array : ");
	int n = sc.nextInt();
	System.out.println("Enter the element of array : ");
	int arr[]  = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println("Enter the searching element : ");
	int el = sc.nextInt();
	System.out.println(Incresing(arr,el , n));
}
}
