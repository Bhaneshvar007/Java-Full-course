package com.java.operatore;

public class Logical {
public static void main(String[] args) {
//	int a = 10 , b = 20;
//	
//System.out.println(a<b && b>a);
//System.out.println(b<20&&a==10);
//
//System.out.println(b<20||a==10);
//System.out.println(b<20||a==10);
//
////System.out.println(a!=b ); // Value is True because it by default using a Relational operatpre;
//	
	int t = 33 , p = 30;
	System.out.println("Pass " + (t<p || t==p));
	System.out.println("Fail " + (t>=p && t!=p));

 
}
}