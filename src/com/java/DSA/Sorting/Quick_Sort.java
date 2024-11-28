package com.java.DSA.Sorting;

public class Quick_Sort {

	public static void QuickSort(int arr[], int s, int e) {
		
		if (s < e) {
			int i = partition(arr, s, e); // i-> jha se array aprtion ho rha hai

			QuickSort(arr, s, i - 1); // left side of the array
			QuickSort(arr, i + 1, e);  // right side of the array
		}
	}
	
	public static int partition(int[] arr , int s,int e) { // ye method ek sorted value retur kar rha hai -> jha se array partitaion ho rha hai.
		int pivot = arr[e];
		int i=s-1;
	    for(int j=s;j<=e;j++) {
	    	if(pivot >= arr[j]) {
	    		i++;
	    		int k = arr[i];
	    		arr[i] = arr[j];
	    		arr[j] = k;
	    	}
	    }
		return i;
	}

	public static void main(String[] args) {
		int arr[] = { 12, 9, 7, 1, 8, 4 };
		int s = 0, e = arr.length- 1;
		QuickSort(arr, s, e);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
