package com.tnsif.RunTimePolymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bank bk = new Bank();
		
        bk = new ICICI();
        System.out.println("Rate of Interest at ICICI "+ bk.getRateOfInterest());
        
        bk = new HDFC();
        System.out.println("Rate of Interest at HDFC "+ bk.getRateOfInterest());
        
        bk = new SBI();
        System.out.println("Rate of Interest at SBI "+ bk.getRateOfInterest());

	}

}
