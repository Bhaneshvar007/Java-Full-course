package com.java.Exersixe.LeetCodeProblem;

// factorial trailing Zeroes :  That mean hoe many zeroes travel in thare given number. like 5->1 ,120->24,100->24... and show more.

import java.util.*;

public class Problem172 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Facto number is : ");
	int num=sc.nextInt();
	
	int sum=0;
	while(num/5!=0) {
		sum+=num/5;
		num/=5;
	}
	System.out.println(sum);
}
}
