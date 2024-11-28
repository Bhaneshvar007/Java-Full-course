package com.java.opps.InheritanceMLExample;

public class Child extends GrandParent {
	public void m1() {
		System.out.println("Child Class with 'M1' Method");
	}

	public void m2() {
		System.out.println("Child Class with 'M2' Method");
	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();	
		obj.m5();	
		obj.m6();
	}
}