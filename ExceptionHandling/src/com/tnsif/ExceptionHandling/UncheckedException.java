package com.tnsif.ExceptionHandling;

//import java.util.Arrays;

public class UncheckedException {

	public static void main(String arg[]) {
	int x [];
	
	
	try {
	x = new int[] {1,2,3,4,5,6};
	
//	System.out.println(Arrays.toString(x));
	System.out.println(x[10]);
	}
	catch(ArrayIndexOutOfBoundsException ae){
		System.out.println("specified index does not exit "+ ae.getMessage());
	}
//	System.out.println(x[10]);
	System.out.println("end of the program");
	
	}
}
