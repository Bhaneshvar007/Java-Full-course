package com.java.DSA.ArrayDsa;

import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("enter");
         String str[]= {"abs","abs","abs"};
         for(int i=0;i<str.length;i++) {
        	 if(str[i].charAt(i)==str[i+i].charAt(i)) {
        		 System.out.print(str[i].charAt(i));
        	 }
         }
         
 	}

}
