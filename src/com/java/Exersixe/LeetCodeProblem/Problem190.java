package com.java.Exersixe.LeetCodeProblem;

// Reverse a bit Example : 1011 O/P : 1101 but ans wil be dacimal value(11);

import java.util.*;

public class Problem190 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("");
	String bit=sc.next();
	String temp="";
	for(int i=bit.length()-1;i>=0;i--) {
		temp+=bit.charAt(i);
	}
	
	long num =Integer.parseInt(temp,2);
	System.out.println(num);
}

}
