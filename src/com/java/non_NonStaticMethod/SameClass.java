package com.java.non_NonStaticMethod;

import com.java.non_NonStaticMethodFromDiffPkg.DiffPkg;

public class SameClass {
	public void clg() {
		System.out.println("Same Class");
	}
	
	public static void main(String[] args) {
		
		SameClass Sc=new SameClass();
		Sc.clg();
		
		DiffClass Dc=new DiffClass();
		Dc.inst();
		
		DiffPkg Dp=new DiffPkg();
		Dp.diffPkg();
	}
}
