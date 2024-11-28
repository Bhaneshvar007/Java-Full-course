package com.java.CampusMonk;
 
import java.util.*;

public class PermutationString {
	
	public static int fact(int n) {
		int ans =1;
		for(int i=2;i<=n;i++) {
			ans*=i;
		}
		return ans;
	}
	
	public static int Permutation(String s) {
		
		int len=s.length();
		
		for(int i=1;i<=len;i++) {
			
		}
		int prm = fact(len) ;
		return prm;
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Entre the string : ");
	String s = sc.nextLine();
	System.out.println(Permutation(s));
}
}
