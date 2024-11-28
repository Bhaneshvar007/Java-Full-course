package com.java.Exersixe;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
	
	public static String SortStr(String ip) {
		char chArr[]=ip.toCharArray();
 	    Arrays.sort(chArr);
 	    return new String(chArr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String : ");
		String str = sc.nextLine();
		String output = SortStr(str);
		System.out.println(output);
	}

}
