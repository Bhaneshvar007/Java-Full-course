package com.java.Exersixe;

import java.util.Scanner;

public class AreaDiaCir {
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter any number : ");
	        int r=sc.nextInt();
	        int area =r*r*22/7;
	        int dia=2*r;
	        int cir= 2*r*22/7;
	        System.out.println("Area : " + area+" Dia : " + dia + " Cir : "+ cir);
	    }
}
