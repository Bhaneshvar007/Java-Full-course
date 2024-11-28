package com.java.Exersixe;

public class GetBit {
	public static void main(String[] args) {
		int n = 5;
		int pos = 3;
		int bitmask = 0001 << pos;
		
		if ((bitmask & n) == 0) {
			System.out.println("Bit Palce is Zero");
		}
		else {
			System.out.println("Bit Palce is One");
		}
	}
}
