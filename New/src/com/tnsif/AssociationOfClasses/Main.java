package com.tnsif.AssociationOfClasses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee em = new Employee(123, "Rohan", "Developer");
		
		Company cm = new Company("meta", em);
		
		System.out.println(cm);
		

		System.out.print(em);
	    
	    
	    
	    

	}

}
