package com.tnsif.ExceptionHandling;
import java.util.Scanner;

public class Division {
      public static void divide() {
    	  int a,b,c;
    	  int arr[] = {13,78};
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Enter two number");
    	  
    	  try {
    		  a = sc.nextInt();
    		  b = sc.nextInt();
    		  c = a/b;
    		  System.out.println("C "+ c);
    		  System.out.println(arr[c]);
    		  
    	  }
    	  catch(ArithmeticException ae) {
    		  System.out.println("I am in catch bloc "+ ae.getMessage());
    	  }
//    	  catch() {
//    		  
//    	  }
      }

	
}
