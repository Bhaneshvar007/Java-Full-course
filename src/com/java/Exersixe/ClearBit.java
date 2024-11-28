package com.java.Exersixe;

public class ClearBit {
	public static void main(String[] args) {
		int n = 5;
		int pos = 2;
		int bm = 1 << pos;
		int num = ~(bm);
		System.out.println("Number is an decimal : " + (num&n) +" & Binary is : " + Integer.toBinaryString(num&n));
		
	}
}
