package com.java.DSA.ArrayDsa;

public class NextGreterElement {
public static void main(String[] args) {
	int arr[]= {7,2,5,10};
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
 				System.out.println(arr[i]+" --> " + arr[j]);	
 				break;
			}
			else {
 				 
			}
		}
	}
	System.out.println(arr[arr.length-1]+" --> -1");	
}
}
