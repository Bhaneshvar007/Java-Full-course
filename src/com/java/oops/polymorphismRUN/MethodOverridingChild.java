package com.java.oops.polymorphismRUN;

public class MethodOverridingChild extends MethodOverridingParent {
	public void laptop() {
		super.laptop();
		System.out.println("Child Laptop");
	}

	public static void main(String[] args) {
		MethodOverridingChild obj =new MethodOverridingChild();
		obj.laptop();
	}
}
