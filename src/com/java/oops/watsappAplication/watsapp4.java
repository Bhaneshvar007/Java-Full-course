package com.java.oops.watsappAplication;

public class watsapp4 extends watsapp3 {
	public void display() {
		super.display();
		System.out.println("Massgae Reply by the user");
	}

	public void status() {
		super.status();
		System.out.println("User will be seen your status");
	}

	public void call() {
		super.call();
		System.out.println("You can able to voice and video call ");
	}

	public static void main(String[] args) {
		watsapp4 wtsp = new watsapp4();
		wtsp.display();
		wtsp.status();
		wtsp.call();
	}

}
