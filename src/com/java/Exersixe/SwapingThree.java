package com.java.Exersixe;

public class SwapingThree {
	  static public void main(String[] args) {
	        int a = 1,b=2,c=3,d;
//	         With Operatore
	        d = a+b+c;
	         a=d-c;
	         b=a-b;
	         c=a-b;
//	         Without operatore
	        d=c;
	        c=b;
	        b=a;
	        a=d;
	        
	        
	        System.out.println(a);
	        System.out.println(b);
	        System.out.println(c);
		 
 	    }
}
