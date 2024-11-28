package com.java.Exersixe;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongInteger {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Input Number is : ");
	 int n=sc.nextInt();
	 
	 BigInteger fact =  BigInteger.ONE;
	 
	 for(int i=2;i<=n;i++) {
		 fact=fact.multiply(BigInteger.valueOf(i));
	 }
	 System.out.print(fact);
}
}
