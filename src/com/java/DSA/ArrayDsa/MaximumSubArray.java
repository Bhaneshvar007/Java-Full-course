package com.java.DSA.ArrayDsa;

import java.util.Scanner;

public class MaximumSubArray {
	
	// For maximum
	
// 	    public static int maxSubArray(int[] nums) {
//	       int sum =0,ans=nums[0];
//	       for(int i=0;i<nums.length;i++){
//	        sum+=nums[i];
//	        ans = Math.max(ans,sum);
//	        if(sum<0) sum=0;
//	       }
//			 
//	        return ans;
//	    }
 	    
 	    // Min value
 	    
 	    public static int minSubArray(int[] nums) {
 	    	int sum =0,ans=nums[0];
 	    	for(int i=0;i<nums.length;i++){
 	    		sum+=nums[i];
 	    		ans = Math.min(ans,sum);
// 	    		if(sum<0) sum=0; // For maximum
 	    		if(sum>0) sum=0; // For minimum
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
		
//		System.out.println(maxSubArray(arr));
		System.out.println(minSubArray(arr));
	}
}
