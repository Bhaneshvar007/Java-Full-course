package com.java.Exersixe;

import java.util.Scanner;

public class CountVovel {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println();
	String s=sc.nextLine();
	int a=0,e=0,i=0,o=0,u=0;
	
	for(int j=0;j<s.length();j++) {
		if(s.charAt(j)=='a') {
			a++;
		}
		
		if(s.charAt(j)=='e') {
			e++;
		}
		
		if(s.charAt(j)=='i') {
			i++;
		}
		if(s.charAt(j)=='o') {
			o++;
		}
		if(s.charAt(j)=='u') {
			u++;
		}
	}
	
	System.out.println("a : " +a);
	System.out.println("e : " +e);
	System.out.println("i : " +i);
	System.out.println("o : " +o);
	System.out.println("u : " +u);
 }
}
