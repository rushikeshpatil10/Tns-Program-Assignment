package com.tnsif.AssociationOfClasses;

public class Company {
	
       String comapany_name;
       Employee employee;

	public Company(String comapany_name, Employee employee ) {
		super();
		this.comapany_name = comapany_name;
		 this.employee = employee;
	}

	@Override
	public String toString() {
		return "Company [comapany_name= " + comapany_name +" " +   employee+  "]";
	}

	

	
	
	
       
       
}
