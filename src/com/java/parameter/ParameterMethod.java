package com.java.parameter;

public class ParameterMethod {
public static void BioData(int age , String name , Float height) {
	System.out.println("Age : " + age);
	System.out.println("Name : " + name);
	System.out.println("Height : " + height);
}
public static void main(String[] args) {
	BioData(20, "Abhishek", 5.6f);
 }
}

