package com.java.static_method;

import com.java.diffpkg.ClassFromDiffPkg;
 
public class StaticFromSameMethod {
	public static void Bike() {
		System.out.println("Bike from same class");
	}

	public static void Car() {
		System.out.println("Cars from same class");
	}
	
	public static void main(String[] args) {
		Bike();
		Car();
		
		DiffClass.Su_bike();
		DiffClass.Su_car();
		
		ClassFromDiffPkg.laptop();
	
	}
}
