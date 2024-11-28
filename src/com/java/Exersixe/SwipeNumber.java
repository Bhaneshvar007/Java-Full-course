package com.java.Exersixe;

public class SwipeNumber {
	public static void main(String[] args) {
		int a = 2, b = 3;
		int c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);

//		without swapping

		int c1 = a + b;
		
		a = c1 - b;
		b = c1 - a;
		System.out.println(a);
		System.out.println(b);

	}
}
