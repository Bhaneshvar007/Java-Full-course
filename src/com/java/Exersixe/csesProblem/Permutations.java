package com.java.Exersixe.csesProblem;
 
// one side odd and another side even number print.like get input 5 print the output 2,4,5,1,3 
import java.util.*;
public class Permutations {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the num : ");
	int n= sc.nextInt();
	if(n==1) {
		System.out.println("1");
	}
	if(n==3) {
		System.out.println("No Solution");
	}
	
	for(int i=1;i<=n;i+=2) {
		System.out.print(i + " ");
	}
	
	for(int i=2;i<=n;i+=2) {
		System.out.print(i + " ");
	}
}
}
