package com.java.oops.AbstrctionExample;

public class Concreate extends PayMentApp {

	@Override
	public void Offer() {
		// TODO Auto-generated method stub
		System.out.println("You have check a bank and loan offers");
		
	}
	
	public static void main(String[] args) {
		Concreate ob = new Concreate();
		ob.Offer();
		ob.Sent();
		ob.Recive();
	}
}
