package com.java.DSA.Recursion;

public class Func1 {
	public static int func(int n) {
		int i=1;
		if(n>=5) return n;
		n+=i;
		i++;
		return func(n);
	}
public static void main(String[] args) {
	System.out.println(func(1));
	
}
}
