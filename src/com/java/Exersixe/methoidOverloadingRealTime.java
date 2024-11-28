package com.java.Exersixe;

public class methoidOverloadingRealTime {
	public void Flipcart(String Mobile) {
		System.out.println(Mobile);
	}

	public void Flipcart(String Mobile, int Ver) {
		System.out.println(Mobile + " " + Ver);

	}

	public void Flipcart(String Mobile, String BackCover) {
		System.out.println(Mobile + " " + BackCover);

	}

	public void Flipcart(int bet, String mh) {
		System.out.println(bet + " " + mh);

	}

	public void Flipcart(int ram, int rom) {
		System.out.println(ram + " " + rom);

	}

	public void Flipcart(String col, int ram, int rom) {
		System.out.println(col + " " + ram + " " + rom);
	}

	public void Flipcart(String mobile, String col, int ram, int rom) {
		System.out.println(mobile + " " + col + " " + ram + " " + rom);
	}

	public static void main(String[] args) {
		methoidOverloadingRealTime obj = new methoidOverloadingRealTime();
		obj.Flipcart("Redmi");
		obj.Flipcart("Redmi", 12);
		obj.Flipcart("Redmi", "TRansperent cover");
		obj.Flipcart(5000, "mh");
		obj.Flipcart(6, 128);
		obj.Flipcart("Black", 6, 256);
		obj.Flipcart("Redmi", "Black", 6, 256);
	}

}
