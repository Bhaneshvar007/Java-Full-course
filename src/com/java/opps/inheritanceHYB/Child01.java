package com.java.opps.inheritanceHYB;

public class Child01 extends ParentClass {
	public void m011() {
		System.out.println("Child Class 01 with 'M1' Method");
	}

	public void m012() {
		System.out.println("Child Class 01 with 'M2' Method");
	}

	public static void main(String[] args) {
		Child01 obj1 = new Child01();
		obj1.m011();
		obj1.m012();
		obj1.m3();
		obj1.m4();
		
		System.out.println();
		Child02 obj2 = new Child02();
		obj2.m021();
		obj2.m022();
		obj2.m3();
		obj2.m4();

		System.out.println();
		Child03 obj3 = new Child03();
		obj3.m031();
		obj3.m032();
		obj3.m3();
		obj3.m4();
	}
}
