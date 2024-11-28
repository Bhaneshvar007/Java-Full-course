package com.java.Constructore;

public class UserDefineConst {

	int a;
	float b;
	char c;
	String d;
	
	UserDefineConst(){
		a=10;
		b=10.90f;
		c='A';
		d="Jbp";
		
	}

	public void user() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	public static void main(String[] args) {
		UserDefineConst us = new UserDefineConst();
		us.user();
	}
}
