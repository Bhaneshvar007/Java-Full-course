package com.java.DSA.ArrayDsa;
// find only even number
public class SingleElement {
public static void main(String[] args) {
	int arr[] = {1,2,3,2,1,5,5};
	int ans =0;
	for(int i=0;i<arr.length;i++) {
		ans^=arr[i];
	}
	System.out.println(ans);
}
}
