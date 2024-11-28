package com.java.DSA.Sorting;

public class InsertionSort {
public static void main(String[] args) {
	int arr[] = { 2 , 5 , 4 , 1 , 3};
	for(int i=1;i<arr.length;i++) {
 			int current=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>current) {  // When current element is grater its previous element
				arr[j+1]=arr[j]; // Right rotation.
				j--;
			}
			arr[j+1]=current; // j first position me aa jayega jisse current element consider nhi hoga easily [ j+1 ] ki value [ current ] me dale.
	} 
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i] + " ");
	}
}
}
