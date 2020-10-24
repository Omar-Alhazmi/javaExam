package com.company;

public class Main {

    public static void main(String[] args) {

		//Make an object of Customer class and gev it Id and name
		//and discount
		Customer ahmed = new Customer(10,"ahmed",20);
		//Make an object of Invoice class and gev it Id and Customer name
		//and total amount
		Invoice ahmedInv = new Invoice(10,ahmed,100);
		ahmedInv.printAll();
	

    }
}
