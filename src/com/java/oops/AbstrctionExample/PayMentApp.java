package com.java.oops.AbstrctionExample;

abstract public class PayMentApp {
	public void Sent() {
		System.out.println("Payment Send Sucssesfully");
	}

	public void Recive() {
		System.out.println("Payment Recive Sucssesfully");
	}

	abstract public void Offer();
}
