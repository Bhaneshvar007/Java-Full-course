package com.java.DSA.ArrayDsa;

public class RotateLeftKTime {
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

 	    public static void main(String[] args) {
	        int arr[]={1,2,3,4,5};
	        
	        // leftRotation ----
	        
	        int k=30;
	        k=k%arr.length;
	        
	        for(int j=0;j<k;j++){
	        int temp=arr[0];
	            for(int i=0;i<arr.length-1;i++){
	            arr[i]=arr[i+1];
	        }
	        arr[arr.length-1]=temp;
	        }
	        
	        for(int i=0;i<arr.length;i++){
	            System.out.print(arr[i] + ",");
	        }
	     }
	
}
