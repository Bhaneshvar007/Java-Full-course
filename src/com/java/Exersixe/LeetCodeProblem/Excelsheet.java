package com.java.Exersixe.LeetCodeProblem;

// Excel sheet colume number a->1,b->2....ab->28,zy->701....and show more

import java.util.Scanner;

public class Excelsheet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input : ");
		String str = sc.next().toUpperCase();
		int sum=0;int p=0;
		for (int i = str.length()-1;i>=0;i--) {
			 int lan = str.charAt(i)-64;
			 sum+=Math.pow(26, p++)*lan;
  		}
		System.out.println(sum);
 	}
}
