package com.java.DSA.ArrayDsa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
public static void main(String[] args) {
	
	// brootForse approach.
	
	int arr[]= {2,3,4,5,3,3,1,2,9};
//	Set< Integer > s= new HashSet<>();
//	for(int i=0;i<arr.length;i++) {
//		for(int j=i+1;j<arr.length;j++) {
//			if(arr[i]==arr[j]&&(i!=j)) {
//				System.out.println(arr[i]);
//			}	
//		}
//	}
	
	
	
	
//	
//	for(int a:arr) {
//		if(s.add(a)==false) {
//			System.out.println(a);
//		}
//	}
	
	Arrays.sort(arr);
	
	for(int i=0;i<arr.length-2;i++) {
		if(arr[i]==arr[i+1]) {
			System.out.println(arr[i]);
		}
	}

	
}
}
