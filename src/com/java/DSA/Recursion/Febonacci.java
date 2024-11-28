package com.java.DSA.Recursion;

import java.util.Scanner;

public class Febonacci {
	public static int feb(int n) {
 		if(n==0||n==1) return n;
 		
		return feb(n-1) + feb(n-2);  // febonaci ka nth number uske last 2 sum par depend kar rha hai
		//( feb(5) -> feb(4)+feb(3) -> 5
		//( feb(4) -> feb(3)+feb(2) -> 3 
		//( feb(3) -> feb(2)+feb(1) -> 2 
		//( feb(2) -> feb(1)+feb(0) -> 1 
		//( feb(1) -> feb(0)        -> 0.
 	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("number : ");
		int n = sc.nextInt();
//		System.out.println(sum(n),0);
		System.out.println(feb(n));
	}
}
