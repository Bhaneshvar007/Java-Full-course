package com.java.Exersixe;

import java.util.*;

public class AreaVolumeCir {

	public static void squre(int s, int h) {
		int area = s * s;
		int volume = s * s * h;
		System.out.println("Area of squre is : " + area + " & Volume is : " + volume);
	}

	public static void cone(int r, int l, int h) {
		int area = r * r * 22 / 7 + r * l * 22 / 7;
		int volume = r * r * h * 1 / 3 * 22 / 7;
		System.out.println("Area of cone is : " + area + " & Volume is : " + volume);
	}
	
	public static void Cylinder(int r, int h) {
		int area = 2*r*h*22/7*2*r*r*22/7;
		int volume = r * r * h * 22 / 7;
		int cir=2*r*22/7;
		System.out.println("Area of cone is : " + area + " Volume is : " + volume + " Circumgfrence "+cir);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side and height of the Squre : ");
 		int s = sc.nextInt();
		int h = sc.nextInt();
		squre(s, h);

		System.out.print("Enter radius , slanth height and height of the cone : ");
		int r = sc.nextInt();
		int sl = sc.nextInt();
		int H = sc.nextInt();
		cone(r, sl, H);
		
		System.out.print("Enter radius and height of the cylander : ");
		int r1 = sc.nextInt();
 		int H1 = sc.nextInt();
 		Cylinder(r1, H1);
 		
	}
}
