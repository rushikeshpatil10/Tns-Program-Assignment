package com.tnsif.nestedCatchBlock;

public class NestedTryCatch {
  public static void check() {
	  
	  
	  String str = "TNS";
	  int sLength = str.length();
	  System.out.println("Length is "+ sLength);
	  
	  String anotherString = null;
	  int y = 5;
	  try {
		  try {
			  System.out.println(str.charAt(y));
		  }catch(StringIndexOutOfBoundsException ae) {
			  System.err.println("Error Occour... "+ ae.getMessage());
		  }
		  System.out.println(anotherString.length());
	  }
	  catch(NullPointerException ae){
		  System.err.println("Error Occour... "+ ae.getMessage());
	  }
//	  System.out.println(str.charAt(y));
//	  System.out.println(anotherString.length());
  }
}
