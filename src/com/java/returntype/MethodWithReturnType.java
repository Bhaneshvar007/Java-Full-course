package com.java.returntype;

public class MethodWithReturnType {
	public static int add() {
		int a = 100, b = 20, c;
		c = a + b;
//		System.out.println(c);
		return c;
	}
	
	public static String name() {
		String city = "Jablpur";
		return city;
	}

	public static void main(String[] args) {
//		System.out.println(add());
		int x = add();
		System.out.println("Sum is : " + x);
		
		System.out.println("City name is : " +name());
	}
}
