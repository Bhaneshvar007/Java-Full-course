package com.java.DSA.DynamicPrograming;

public class febonaciSeries {
	// Recursion Code.
	public static int recursion(int n) {
		if (n <= 1)
			return n;
		return recursion(n - 2) + recursion(n - 1);
	}
	
	
	
	
	

	// Using Top Down Dp.
	public static int topDown(int n, int[] dp) {
		if (n <= 1) {
            return n;
		}
		if(dp[n]!=-1) return dp[n];
		dp[n] = topDown(n-1,dp) + topDown(n-2,dp);
		return dp[n];
	}

	
	
	
	
	
	public static void main(String[] args) {
		int n = 7;
	System.out.println("Recursion Result is " +recursion(n));

	
	
	
	
		int dp[] = new int[n+1];
		for (int i = 0; i <= n; i++)
			dp[i] = -1;
		System.out.println("Top Down Result is " + topDown(n, dp));
		
		
		
		
		
		// Code for bottom up dp
		int a =0;
		int b = 1;
		for(int i=2;i<=n;i++) {
			int c = a+b;
			a = b;
			b = c;
		}
		System.out.println("Bottom Up Result is " + b);
	}
}
