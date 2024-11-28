package com.java.thisAndSuper;

public class Child extends Parent {
	int a = 40;
	int b = 50;

	public void demo() {
		int a = 10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(this.a);
		System.out.println(this.b);
		
 		System.out.println(super.a);
		System.out.println(super.b);
	}

	public static void main(String[] args) {
		Child ob = new Child();
		ob.demo();
	}
}
