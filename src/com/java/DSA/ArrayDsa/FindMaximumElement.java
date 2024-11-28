package com.java.DSA.ArrayDsa;

// PiarWise checking algorithm

public class FindMaximumElement {
public static void main(String[] args) {
	int arr[] = {2,3,1,5,4};
	int max=arr[0];
 	for(int i=0;i<arr.length;i++) {
// 			if(max<arr[i]) { // Find maximum element
 				if(max>arr[i]) { // Minimum Element
 				max=arr[i];            
 				
 			}
	}
 	System.out.println(max);
}
}
