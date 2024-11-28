package com.java.DSA.Sorting;

public class MergeSort {
	public static void devide(int arr[], int s, int e) {
		if (s < e) {
 		int mid = s + (e - s) / 2; // Split the array index.
		devide(arr, s, mid); // left portion -> when it can't be complete it can not be move next line.
								// ( jab tak left ke sare element devide na ho jaye right devide ni hoga
		devide(arr, mid + 1, e); // right portion -> when it complete move for merge calling.

		merge(arr, s, mid, e); // For merge calling
	}
	}

	// Merge to array in sorted order.
	public static void merge(int arr[], int s, int mid, int e) {
		int n1 = mid + 1; // Size of left array.
		int n2 = e - mid; // Size of right array.

		int l[] = new int[n1]; // left sub array.
		int r[] = new int[n2]; // right sub array.

		// insert element an left start in first index and move
		// forword.(s+0,s+1,s+2...s+i)
		for (int i = 0; i < n1; i++) {
			l[i] = arr[s + i];
		}

		// Insert an right array mid+1 se dalna hai and move forword
		// (mid+1+0,mid+1+1,mid+1+2....mid+1+i)
		for (int i = 0; i < n2; i++) {
			r[i] = arr[mid + 1 + i];
		}
		
		
		// Merger the left  { l[]  } and right { r[] } array
		
		int i= 0,j=0;
		int k=s;
		while(i<n1 && j <n2) {
			if(l[i] <= r[j]) {
				arr[k] = l[i];
				i++;
			}
			else {
				arr[k] = r[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k] = l[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = r[j];
			j++;
			k++;
		}
		
	}

	public static void main(String[] args) {
		int arr[] = { 8, 6, 2, 3, 9, 4, 3 };
		int s = 0, e = arr.length - 1;
		devide(arr, s, e);
		
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i] + " ");
		 }

	}
}
