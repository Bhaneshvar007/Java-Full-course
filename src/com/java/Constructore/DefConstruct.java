package com.java.Constructore;

public class DefConstruct {
	int a;
	float f;
	String s;
	char c;
	boolean b;

	public void df() {
		System.out.println(a);
		System.out.println(f);
		System.out.println(s);
		System.out.println(c);
		System.out.println(b);
	}
	public static void main(String[] args) {
		DefConstruct obj =  new DefConstruct();
		obj.df();
	}
}
