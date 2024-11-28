package com.java.conditionalstatement;

public class marksAsignment {
public static void main(String[] args) {
	int marks = 98;
	
	if(marks>=100) {
		System.out.println("Invailid  massage");
	}
	
	else if(marks>=90) {
		System.out.println("Pass with A grade");
	}
	
	else if(marks>=75) {
		System.out.println("Pass with B grade");
	}
	
	else if(marks>=60) {
		System.out.println("Pass with c grade");
	}
	
	else if(marks>=45) {
		System.out.println("Pass with d grade");
	}
	
	
	else if(marks<=33 && marks>=0)  {
		System.out.println("Student is fail");
	}
	
	else {
		System.out.println("Invalid Condition");
	}
}
}
