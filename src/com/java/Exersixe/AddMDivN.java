package com.java.Exersixe;

import java.util.Scanner;

public class AddMDivN {
	  public static int div(int m,int n){
          int sum=0;
           for(int i=1;i<=n;i++){
                if(i%m==0){
                   sum+=i;
               }
           }
           
               return sum;
      }
  public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      System.out.println("number;");
      int m = sc.nextInt();
      int n = sc.nextInt();
      System.out.println(div(m,n));
   }
}
