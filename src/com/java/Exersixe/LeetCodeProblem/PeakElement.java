package com.java.Exersixe.LeetCodeProblem;

public class PeakElement {
 	    public static int findPeakElement(int[] nums) {
	        int i=0;
	        int j=i+1;
	        int temp = 0;
	        while(j<nums.length){
	            if(nums[i]<nums[j]){
	                i++;
	                j++;
	            }
	            if(nums[i]>nums[j]){
	              temp = i;
	              i++;
	              j++;
 	            }
	        }
	        return temp;
	    }
 	    
 	    public static void main(String[] args) {
			int arr[]= {1,2,1,3,5,6,4};
			System.out.println(findPeakElement(arr));
		}
	
}
