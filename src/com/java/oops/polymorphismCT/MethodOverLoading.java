package com.java.oops.polymorphismCT;

public class MethodOverLoading {
	public void demo() {
		System.out.println("Hello");
	}

	public void demo(int a) {
		System.out.println(a);
	}

	public void demo(String a) {
		System.out.println(a);
	}

	public void demo(int a, String b) {
		System.out.println(a + " " + b);
	}

	public void demo(String a, int b) {
		System.out.println(a + " " + b);
	}

	public void demo(int a, int b, int c) {
		System.out.println(a + " " + b + " " + c);
	}
	
	public void demo(int a, String b, int c) {
		System.out.println(a + " " + b + " " + c);
	}

	public static void main(String[] args) {
		MethodOverLoading mo = new MethodOverLoading();

		mo.demo();
		mo.demo(10);
		mo.demo("Jablpur");
		mo.demo(10, "Jabalpur");
		mo.demo("Jablpur", 10);
		mo.demo(10, 20, 30);
		mo.demo(10, "Mp", 30);
	}
}
