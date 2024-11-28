package com.java.DSA.SlidingWindow;

import java.util.Scanner;

public class MaxProductArrofK {
	public static int Product(int[] nums,int k) {
		int prdt=1;
	
 		for (int i = 0; i < k; i++) {
 			prdt*=nums[i];
		 
	    }
 		int ans=prdt;
		 		
 		for(int i=k;i<nums.length;i++) {
// 			prdt/=nums[i-k];.
 			if((nums[i-k])==0) {
 				break;
 			}
  			prdt*=nums[i];
 			ans=Math.max(ans, prdt);
 			if(prdt==0) prdt=1;
 		}
 		prdt=1;
 		for(int i=nums.length-1;i>=k;i--) {
 			prdt/=nums[i-k];
  			prdt*=nums[i];
 			ans=Math.max(ans, prdt);
 			if(prdt==0) prdt=1;
  		}
 		return ans;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your array size : ");
		int n = sc.nextInt(); // Size of array;

		int arr[] = new int[n];
		System.out.print("Enter your array element : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter your window size : ");
		int k=sc.nextInt();

		System.out.println(Product(arr , k));
	}
}
