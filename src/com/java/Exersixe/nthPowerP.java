package com.java.Exersixe;

import java.util.Scanner;

public class nthPowerP {
	
	public static int NpowerP(int n , int p) {
//		int ans1 = (int) Math.pow(n, p);
		int ans = 1;
		 while(p!=0) {
			ans*=n;
			p--;
		 }
		return ans;
 	}
	
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Input Number: ");
	int n = sc.nextInt();
	System.out.println("power Number: ");
	int p = sc.nextInt();

	int result = NpowerP(n , p ); 
    System.out.println(result);
}
}
