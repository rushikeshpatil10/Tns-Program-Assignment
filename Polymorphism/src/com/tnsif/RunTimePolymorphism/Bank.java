package com.tnsif.RunTimePolymorphism;

public class Bank {

	float getRateOfInterest() {
 	   return 0;
    }
}

class ICICI extends Bank{
	 float getRateOfInterest() {
 	   return 8.3f;
    }
}

class SBI extends Bank{
	 float getRateOfInterest() {
	   return 6.5f;
   }
}

class HDFC extends Bank{
	 float getRateOfInterest() {
	   return 8.5f;
   }
}