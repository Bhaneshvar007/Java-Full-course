package com.java.Constructore;

public class Example {
    int c;
	Example(int a, int b) {  // Paramertize Constructore (parametr)
		 c = a + b;
 	}

	public void add() {
		System.out.println(c);
	}
	public static void main(String[] args) {
		
 		Example ex = new Example(100, 30);  // Passing argument
		ex.add();
 	}
}
