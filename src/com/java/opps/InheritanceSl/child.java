package com.java.opps.InheritanceSl;

public class child extends ParentClass {
	public void m1() {
		System.out.println("Child Class with 'M1' Method");
	}

	public void m2() {
		System.out.println("Child Class with 'M2' Method");
	}

	public static void main(String[] args) {
		child obj = new child();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
	}
}
