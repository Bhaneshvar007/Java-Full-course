package com.java.DSA.Recursion;

import java.util.*;

public class SumNthnumber {

 	public static int sum(int n) {
// 		public static int sum(int n , int s) {
		if(n==1) return n;
//		sum(n-1);	
//		s+=n;
//		return s;
		return n*sum(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("number : ");
		int n = sc.nextInt();
//		System.out.println(sum(n),0);
		System.out.println(sum(n));
	}
}
