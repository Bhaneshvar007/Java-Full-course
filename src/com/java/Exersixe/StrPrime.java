package com.java.Exersixe;

import java.util.*;

public class StrPrime {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("input");
	 String s=sc.next();
	 
	 int n=Integer.parseInt(s);
	 boolean ch=false;
	 for(int i=2;i<n;i++) {
		 if(n%i==0) {
			 ch=true;
		 }
	 }
	 if(ch==true) {
		 System.out.println(false);
	 }
	 
	 else {
		 System.out.println(true);
	 }
}
}
