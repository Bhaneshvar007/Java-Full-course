package com.java.AdityaVerma.Stack;

import java.util.*;

public class NextGreaterElementLeft_Stack {
	
	public static void NGL(int arr[] , int n) {
		Stack<Integer> s = new Stack<>();
		int ans[] = new int[n];
		for(int i=0;i<n;i++) {
			if(s.size() == 0) ans[i] = -1;
			
			else if(s.size() > 0 && s.peek() > arr[i]) {
				ans[i] = s.peek();
			}
			
			else if(s.size() > 0 && s.peek() <= arr[i]) {
				while(s.size() > 0 && s.peek() <= arr[i]) {
					s.pop();
				}
				
				if(s.size() == 0 ) {
					ans[i] = -1;
				}
				
				else ans[i] = s.peek();				
			}
			s.push(arr[i]);
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(ans[i] + " ");
		}
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the length of the array : ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	NGL(arr,n);
 }
}
