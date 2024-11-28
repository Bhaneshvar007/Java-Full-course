package com.java.conditionalstatement;

public class MarriageAssignment {
    public static void main(String[] args) {
        int Mage = 20, Fage = 20;

        if (Mage >= 18 && Fage >= 18) {
            System.out.println("Both are eligible for voting");

            if (Mage >= 21) {
                System.out.println("Males are eligible for marriage");

                if (Mage >= 35) {
                    System.out.println("Males are eligible for Job");
                } else {
                    System.out.println("Males are not eligible for Job");
                }
            } else {
                System.out.println("Males are not eligible for marriage");
            }

            if (Fage >= 18) {
                System.out.println("Females are eligible for marriage");

                if (Fage >= 35) {
                    System.out.println("Females are eligible for Job");
                } else {
                    System.out.println("Females are Not eligible for Job");
                }
            } else {
                System.out.println("Females are not eligible for marriage");
            }
        } else {
            System.out.println("Age not for voting");
        }
    }
}

