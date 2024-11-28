package com.java.variable.local;

public class LocalAndGlobel {
	int x = 100; // global variable and non static
	static int y = 100; // global variable and static -> Access anyware

	public void m1() {
		int a = 10; // local variable
		System.out.println(a);
		System.out.println(x);
		System.out.println(y);
	}

	public void m2() {
		int b = 10;
		System.out.println(b);
//		System.out.println(a);// we can not the call local variable out side the method
		System.out.println(x);
		System.out.println(y);
	}

	public static void m3() {
		int c = 20;
//		System.out.println(a);// we can not the call local variable out side the method
//		System.out.println(b);// we can not the call local variable out side the method
		System.out.println(c);
//		System.out.println(x); // Non static varible doen't use in static method
		System.out.println(y);
	}

	public static void main(String[] args) {
 		m3();
	}
}
