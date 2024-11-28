package com.java.DSA.ArrayDsa;

 
public class SumAndProductArr {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int sum=0,prdt=1;
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
		prdt*=arr[i];
	}
	System.out.println("Total Element sum Is "+sum+" And Product is : " + prdt);
 	
}
}
