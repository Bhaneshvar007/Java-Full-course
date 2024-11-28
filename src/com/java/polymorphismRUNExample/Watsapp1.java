package com.java.polymorphismRUNExample;

public class Watsapp1 extends Watsapp {
	public void wtsp() {
		super.wtsp();
		System.out.println("Watsapp Meta version");
	}
	
	public static void main(String[] args) {
		Watsapp1 obj = new Watsapp1();
		obj.wtsp();
	}
}
