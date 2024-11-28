package com.java.ClassAndObject;

 class Student{
	String name;
	int age;
	
	// Non-Parameterized method.
	
	public void print() {
		
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	// Parameterized method.
	public void print(int age,String name) {
		System.out.println(name);
		System.out.println(age);
	}
	
	
	// Using constructor(Parameterized).
	
	Student(String s , int a){
		this.name=s;
		this.age=a;
	}
	
	Student(Student s){
		this.name=s.name;
		this.age=s.age;
	}
}

public class Print {
public static void main(String[] args) {
//	Student st = new Student("Abhishek" , 20); // Parameterized constructor
	Student st = new Student("Abhishek", 10);
	st.print();
	
	st.age=20;
	st.name="Bhaneshvar";
	Student s = new Student(st); // copy constructor

	st.print();
//	st.print(16,"Abhishek"); // Parameterized constructor calling
}
}
