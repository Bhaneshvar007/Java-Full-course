package com.java.AdityaVerma.Stack;

import java.util.Stack;

public class NextSmallerRight_Stack {
	public static void NSE(int arr[],int n) {
		Stack<Integer> s = new Stack<>();
	    int ans[] = new int[n];
		for(int i=n-1;i>=0;i--) {
			if(s.size()==0) {
				ans[i] = -1;
			}
			
			else if(s.size()>0&&s.peek()<arr[i]){
				ans[i] = s.peek();
			}
			
			else if(s.size()>0&&s.peek()>=arr[i]) {
				while(s.size()>0&&s.peek()>=arr[i]) {
					s.pop();
				}
				
				if(s.size()==0) ans[i] = -1;
				else ans[i] = s.peek();
			}
			s.push(arr[i]);
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(ans[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {4,5,1,2,4,3};
		int n = arr.length;
		NSE(arr,n);
	}
}
