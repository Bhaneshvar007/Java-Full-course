package com.java.travlling;

import java.util.Scanner;

public class TravlingAsignMent {
	int Bus, Train, Flite;
	static Scanner sc = new Scanner(System.in);

	public static void Travl() {

		int MyVolet = 10000;

		while (true) {

			System.out.println();
			System.out.println("Welcome to Travlling Plateform");
			System.out.println("Press 1 For Bus Reservation");
			System.out.println("Press 2 For Train Reservation");
			System.out.println("Press 3 For Flite Ticket book");
			System.out.println("Press 4 Check your avelable money");
			int Trav = sc.nextInt();
			switch (Trav) {

			// Bus travells case

			case 1:
				System.out.println("Welcome to Bus Reservation App");
				System.out.println("Press 1 For Indoor");
				System.out.println("Press 2 For Jabalpur");
				System.out.println("Press 3 For Bhopal");
				System.out.println("Press 4 For Balaghat");
				int BusName = sc.nextInt();

				switch (BusName) {

				// Busses for indor

				case 1:
					System.out.println("Buses For Indoor");
					System.out.println("Press 1 for Day");
					System.out.println("Press 2 for Night");
					int day = sc.nextInt();
					switch (day) {

					// Buses for Day

					case 1:
						System.out.println("Buses for Day");
						System.out.println("Press 1 for super fast At 6.30 Am");
						System.out.println("Press 2 for Express At 8.00 AM");
						System.out.println("Press 3 for local At 10.50 AM");

						int Tprice = sc.nextInt();

						// Timing And price for bus

						switch (Tprice) {
						case 1:
							System.out.println("Super Fast Bus(Nandan , pawan,...)₹1000");
							MyVolet = MyVolet - 1000;
							break;

						case 2:
							System.out.println("Super Fast Bus ₹700");
							MyVolet = MyVolet - 700;
							break;

						case 3:
							System.out.println("Local Bus ₹500");
							MyVolet = MyVolet - 500;
							break;

						default:
							System.out.println("No service");

						}
						break;

					// Busses for Night

					case 2:
						System.out.println("Buses for Night");
						System.out.println("Press 1 for super fast At 6.30 PM");
						System.out.println("Press 2 for Express At 8.00 PM");
						System.out.println("Press 3 for local At 10.50 PM");

						Tprice = sc.nextInt();

						// Timing And price for bus

						switch (Tprice) {
						case 1:
							System.out.println("Super Fast Bus(Nandan , pawan,...)₹1500");
							MyVolet = MyVolet - 1500;
							break;

						case 2:
							System.out.println("Super Fast Bus ₹1150");
							MyVolet = MyVolet - 1150;
							break;

						case 3:
							System.out.println("Local Bus ₹700");
							MyVolet = MyVolet - 700;
							break;

						default:
							System.out.println("No service");

						}
						break;

					default:
						System.out.println("No more any time");
					}
					break;

				// Busses for jablpur

				case 2:
					System.out.println("Buses For Jablpur");
					System.out.println("Press 1 for Day");
					System.out.println("Press 2 for Night");
					day = sc.nextInt();
					switch (day) {

					// Busses for Day

					case 1:
						System.out.println("Buses for Day");
						System.out.println("Press 1 for super fast At 6.30 Am");
						System.out.println("Press 2 for Express At 8.00 AM");
						System.out.println("Press 3 for local At 10.50 AM");

						int Tprice = sc.nextInt();

						// Timing And price for bus

						switch (Tprice) {
						case 1:
							System.out.println("Super Fast Bus(Nandan , pawan,...)₹500");
							MyVolet = MyVolet - 500;
							break;

						case 2:
							System.out.println("Super Fast Bus ₹350");
							MyVolet = MyVolet - 350;
							break;

						case 3:
							System.out.println("Local Bus ₹200");
							MyVolet = MyVolet - 200;
							break;

						default:
							System.out.println("No service");

						}
						break;

					// Busses for Night

					case 2:
						System.out.println("Buses for Night");
						System.out.println("Press 1 for super fast At 6.30 PM");
						System.out.println("Press 2 for Express At 8.00 PM");
						System.out.println("Press 3 for local At 10.50 PM");

						Tprice = sc.nextInt();

						// Timing And price for bus

						switch (Tprice) {
						case 1:
							System.out.println("Super Fast Bus(Nandan , pawan,...)₹600");
							MyVolet = MyVolet - 600;
							break;

						case 2:
							System.out.println("Super Fast Bus ₹450");
							MyVolet = MyVolet - 450;
							break;

						case 3:
							System.out.println("Local Bus ₹300");
							MyVolet = MyVolet - 300;
							break;

						default:
							System.out.println("No service");

						}
						break;

					default:
						System.out.println("No more any time");
					}
					break;

//		 	Buses for bhopal

				case 3:
					System.out.println("Buses For Bhopal");
					System.out.println("Press 1 for Day");
					System.out.println("Press 2 for Night");
					day = sc.nextInt();
					switch (day) {

					// Busses for Day

					case 1:
						System.out.println("Buses for Day");
						System.out.println("Press 1 for super fast At 6.30 Am");
						System.out.println("Press 2 for Express At 8.00 AM");
						System.out.println("Press 3 for local At 10.50 AM");

						int Tprice = sc.nextInt();

						// Timing And price for bus

						switch (Tprice) {
						case 1:
							System.out.println("Super Fast Bus(Nandan , pawan,...)₹1000");
							MyVolet = MyVolet - 1000;
							break;

						case 2:
							System.out.println("Super Fast Bus ₹700");
							MyVolet = MyVolet - 700;
							break;

						case 3:
							System.out.println("Local Bus ₹500");
							MyVolet = MyVolet - 500;
							break;

						default:
							System.out.println("No service");

						}
						break;

					// Busses for Night

					case 2:
						System.out.println("Buses for Night");
						System.out.println("Press 1 for super fast At 6.30 PM");
						System.out.println("Press 2 for Express At 8.00 PM");
						System.out.println("Press 3 for local At 10.50 PM");

						Tprice = sc.nextInt();

						// Timing And price for bus

						switch (Tprice) {
						case 1:
							System.out.println("Super Fast Bus(Nandan , pawan,...)₹1200");
							MyVolet = MyVolet - 1200;
							break;

						case 2:
							System.out.println("Super Fast Bus ₹1000");
							MyVolet = MyVolet - 1000;
							break;

						case 3:
							System.out.println("Local Bus ₹900");
							MyVolet = MyVolet - 900;
							break;

						default:
							System.out.println("No service");

						}
						break;

					default:
						System.out.println("No more any time");
					}
					break;

				// Buses for balaghat .

				case 4:
					System.out.println("Buses For Balaghat");
					System.out.println("Press 1 for Day");
					System.out.println("Press 2 for Night");
					day = sc.nextInt();
					switch (day) {

					// Busses for Day

					case 1:
						System.out.println("Buses for Day");
						System.out.println("Press 1 for super fast At 6.30 Am");
						System.out.println("Press 2 for Express At 8.00 AM");
						System.out.println("Press 3 for local At 10.50 AM");

						int Tprice = sc.nextInt();

						// Timing And price for bus

						switch (Tprice) {
						case 1:
							System.out.println("Super Fast Bus(Nandan , pawan,...)₹350");
							MyVolet = MyVolet - 350;
							break;

						case 2:
							System.out.println("Super Fast Bus ₹200");
							MyVolet = MyVolet - 200;
							break;

						case 3:
							System.out.println("Super Local Bus ₹200");
							MyVolet = MyVolet - 200;
							break;

						default:
							System.out.println("No service");
						}
						break;

					// Busses for Night

					case 2:
						System.out.println("Buses for Night");
						System.out.println("Press 1 for super fast At 5.30 PM");
						System.out.println("Press 2 for Express At 8.30 PM");
						System.out.println("Press 3 for local At 10.50 PM");

						Tprice = sc.nextInt();

						// Timing And price for bus

						switch (Tprice) {
						case 1:
							System.out.println("Super Fast Bus(Nandan , pawan,...)₹500");
							MyVolet = MyVolet - 500;
							break;

						case 2:
							System.out.println("Super Fast Bus ₹400");
							MyVolet = MyVolet - 400;
							break;

						case 3:
							System.out.println("Super Local Bus ₹250");
							MyVolet = MyVolet - 250;
							break;

						default:
							System.out.println("No service");

						}
						break;

					default:
						System.out.println("No more any time");
					}
					break;

				default:
					System.out.println("Plz Choose valid option");
				}
				break;

// Train Booking App

			case 2:
				System.out.println("Welcome to Train Booking App");
				System.out.println("Press 1 For Bhopal");
				System.out.println("Press 2 For Indor");
				System.out.println("Press 3 For Nagpur");
				int CityName = sc.nextInt();

// Train for Bhopal.

				switch (CityName) {
				case 1:
					System.out.println("Train for Bhopal Junction");
					System.out.println("Press 1 for Intercity At 5.30AM");
					System.out.println("Press 2 for JanSatabdi Ex At 6.15AM");
					System.out.println("Press 3 for Demul At 10.20AM");

// Intercity Express.

					int TName = sc.nextInt();
					switch (TName) {
					case 1:
						System.out.println("Press 1 for Slepear");
						System.out.println("Press 2 for First Ac");
						System.out.println("Press 3 for Secoud Ac");
						System.out.println("Press 4 for Ganeral");

						int Coatch = sc.nextInt();

//Please select your Coatch

						switch (Coatch) {

						case 1:
							System.out.println("Slepear Coatch");
							System.out.println("Press 1 for Upper Sheet Price as 1190Rs-/");
							System.out.println("Press 2 for Lower Sheet Price as 850Rs-/");
							int sheet = sc.nextInt();

							switch (sheet) {
							case 1:
								System.out.println("Upper Sheet Price as 1190Rs-/");
								MyVolet -= 1190;
								break;

							case 2:
								System.out.println("Lower Sheet Price as 850Rs-/");
								MyVolet -= 850;
								break;

							default:
								System.out.println("No More Sheey are avilable");
							}
							break;

						case 2:
							System.out.println("First AC ");
							System.out.println("Press 1 for Upper Sheet Price as 1890Rs-/");
							System.out.println("Press 2 for Lower Sheet Price as 1250Rs-/");
							sheet = sc.nextInt();

							switch (sheet) {
							case 1:
								System.out.println("Upper Sheet Price as 1890Rs-/");
								MyVolet -= 1890;
								break;

							case 2:
								System.out.println("Lower Sheet Price as 1250Rs-/");
								MyVolet -= 1250;
								break;

							default:
								System.out.println("No More Sheey are avilable");
							}
							break;

						case 3:
							System.out.println("Secound AC");
							System.out.println("Press 1 for Upper Sheet Price as 1590Rs-/");
							System.out.println("Press 2 for Lower Sheet Price as 1050Rs-/");
							sheet = sc.nextInt();

							switch (sheet) {
							case 1:
								System.out.println("Upper Sheet Price as 1590Rs-/");
								MyVolet -= 1590;
								break;

							case 2:
								System.out.println("Lower Sheet Price as 1050Rs-/");
								MyVolet -= 1050;
								break;

							default:
								System.out.println("No More Sheey are avilable");
							}
							break;

						case 4:
							System.out.println("Ganeral Coatch");
							System.out.println("Press 1 for Upper Sheet Price as 890Rs-/");
							System.out.println("Press 2 for Lower Sheet Price as 500Rs-/");
							sheet = sc.nextInt();

							switch (sheet) {
							case 1:
								System.out.println("Upper Sheet Price as 1890Rs-/");
								MyVolet -= 890;
								break;

							case 2:
								System.out.println("Lower Sheet Price as 1250Rs-/");
								MyVolet -= 500;
								break;

							default:
								System.out.println("No More Sheey are avilable");
							}
							break;

						default:
							System.out.println("Please Choose A Valid Coatch");
						}
						break;

// Jansatbdi express

					case 2:
						System.out.println("JanSatabdi Express");
						System.out.println("Press 1 for Slepear");
						System.out.println("Press 2 for First Ac");
						System.out.println("Press 3 for Secoud Ac");
						System.out.println("Press 4 for Ganeral");

						Coatch = sc.nextInt();

// Please select your Coatch

						switch (Coatch) {

						case 1:
							System.out.println("Slepear Coatch");
							System.out.println("Press 1 for Upper Sheet Price as 1190Rs-/");
							System.out.println("Press 2 for Lower Sheet Price as 850Rs-/");
							int sheet = sc.nextInt();

							switch (sheet) {
							case 1:
								System.out.println("Upper Sheet Price as 1190Rs-/");
								MyVolet -= 1190;
								break;

							case 2:
								System.out.println("Lower Sheet Price as 850Rs-/");
								MyVolet -= 850;
								break;

							default:
								System.out.println("No More Sheey are avilable");
							}
							break;

						case 2:
							System.out.println("First AC ");
							System.out.println("Press 1 for Upper Sheet Price as 1890Rs-/");
							System.out.println("Press 2 for Lower Sheet Price as 1250Rs-/");
							sheet = sc.nextInt();

							switch (sheet) {
							case 1:
								System.out.println("Upper Sheet Price as 1890Rs-/");
								MyVolet -= 1890;
								break;

							case 2:
								System.out.println("Lower Sheet Price as 1250Rs-/");
								MyVolet -= 1250;
								break;

							default:
								System.out.println("No More Sheey are avilable");
							}
							break;

						case 3:
							System.out.println("Secound AC");
							System.out.println("Press 1 for Upper Sheet Price as 1590Rs-/");
							System.out.println("Press 2 for Lower Sheet Price as 1050Rs-/");
							sheet = sc.nextInt();

							switch (sheet) {
							case 1:
								System.out.println("Upper Sheet Price as 1590Rs-/");
								MyVolet -= 1590;
								break;

							case 2:
								System.out.println("Lower Sheet Price as 1050Rs-/");
								MyVolet -= 1050;
								break;

							default:
								System.out.println("No More Sheey are avilable");
							}
							break;

						case 4:
							System.out.println("Ganeral Coatch");
							System.out.println("Press 1 for Upper Sheet Price as 890Rs-/");
							System.out.println("Press 2 for Lower Sheet Price as 500Rs-/");
							sheet = sc.nextInt();

							switch (sheet) {
							case 1:
								System.out.println("Upper Sheet Price as 1890Rs-/");
								MyVolet -= 890;
								break;

							case 2:
								System.out.println("Lower Sheet Price as 1250Rs-/");
								MyVolet -= 500;
								break;

							default:
								System.out.println("No More Sheey are avilable");
							}
							break;

						default:
							System.out.println("Please Choose A Valid Coatch");
						}

						break;

// Demul express.
					default:
						System.out.println("Plz Choose a Right Train");
					}

					break;

// Train for indor

				case 2:
					System.out.println("Train for Indor Junction");
					break;

// Train for Nagpur.

				case 3:
					System.out.println("Train for Nagpur Junction");
					break;

				default:
					System.out.println("Plz Choose valid Station");
				}
				break;

// Flite Booking app

			case 3:
				System.out.println("Flite");
				break;

			case 4:
				System.out.println("Check money");
				System.out.println("Your available money is : '₹" + MyVolet + "'");

			default:
				System.out.println("Invalild Massage");
			}
		}
	}

	public static void main(String[] args) {
		Travl();
	}
}
