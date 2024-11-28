package com.java.oops.Abstrction;

public class Concreate extends Abstrction {

	
	public static void main(String[] args) {
		Concreate obj = new Concreate();
		
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("M2");
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("M3");
	}
	
}
