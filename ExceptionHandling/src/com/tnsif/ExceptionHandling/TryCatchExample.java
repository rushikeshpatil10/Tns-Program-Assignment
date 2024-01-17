package com.tnsif.ExceptionHandling;

public class TryCatchExample {

	static void divide(int x, int y) {
		System.out.println("I am in divide method");
		int z;
		try {
		z = x/y;
		System.out.println("result is z :"+ z);
		}
		catch(ArithmeticException ae) {
			System.out.print("I am in catch method "+ ae.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ae1) {
			System.out.println("I am in catch block "+ ae1.getMessage());
		}
		catch(Exception e) {
			System.out.println("I am in catch block "+ e.getMessage());
		}
	}

}
