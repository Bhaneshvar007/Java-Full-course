package com.java.Exersixe;

import java.util.*;

public class Tribonacii_series {

	// top down
	/*
	 * public static int tri(int n){ int dp[] = new int[n+1]; for(int i=0;i<=n;i++)
	 * { dp[i] =-1; } return solve(n,dp); }
	 * 
	 * public static int solve(int n, int dp[]){ if(n==0 || n==1) return 0; if(n==2)
	 * return 1; if(dp[n]!=-1) return dp[n]; dp[n] = solve(n-1,dp) + solve(n-2,dp) +
	 * solve(n-3,dp); return dp[n]; }
	 */

	//Bottom up 
//	public static int tri(int n) {
//		int[] dp = new int[n + 1];
//		dp[0] = 0;
//		dp[1] = 0;
//		dp[2] = 1;
//		for (int i = 3; i <= n; i++) {
//			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
//		}
//		return dp[n];
//	}
	
	
	// Space optimization
	public static int tri(int n) {
 		int a = 0;
		int b = 0;
		int c = 1;
		for (int i = 3; i <= n; i++) {
			int d =a + b + c;
			a=b;
			b=c;
			c=d;
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello : ");
		int n = sc.nextInt();
		System.out.println("Result : " + tri(n));
		

	}

}