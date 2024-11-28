package com.java.conditionalstatement;

public class TravllingAsignment {
public static void main(String[] args) {
	int myMoney = 900;
	
	if(myMoney>=1000) {
		System.out.println("Jabalpur to Mombai");
	}
	
	else if(myMoney>=700) {
		System.out.println("Jabalpur to Indoor");
	}
	
	else if(myMoney>=500) {
		System.out.println("Jabalpur to Bhopal");
	}
	
	else if(myMoney>=250) {
		System.out.println("Jabalpur to Balaghat");
	}
	
	else if (myMoney>=50) {
		System.out.println("Jabalpur to Jabalpur");
	}
	
	else {
		System.out.println("No Money No Travlling");
	}
}

}
