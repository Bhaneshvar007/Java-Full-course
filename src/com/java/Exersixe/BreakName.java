package com.java.Exersixe;

import java.util.Scanner;

public class BreakName {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        System.out.println(s);
        String s2 = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                System.out.println(s2);
                s2 = "";
            } else {
                s2 += s.charAt(i);
            }
        }
         System.out.println(s2);
    }
}
