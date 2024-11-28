package com.java.TestDrive;

public class QuickSortAlgo {
	
	public static void sort(int arr[] , int s ,int e )
	{
		if(s<e) {
			int i = partition(arr,s,e);
			sort(arr , s, i-1);
			sort(arr,i+1,e);
		}
	}
	
	public static int partition(int arr[] , int s , int e) {
		int pivot = arr[e];
		int j=s-1;
		for(int i=s;i<=e;i++) {
			if(arr[i] <= pivot) {
				j++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		
		return j;
	}
	
public static void main(String[] args) {
	int arr[] = {4,5,2,3,7,65,4,9};
	sort(arr, 0 , arr.length-1);
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i] + " ");
	}
}
}
