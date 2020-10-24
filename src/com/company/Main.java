package com.company;

public class Main {

    public static void main(String[] args) {
	    Customer ahmed = new Customer(10,"ahmed",20);
	    Invoice ahmedInv =new Invoice(10,ahmed,100);
		ahmedInv.printAll();
	

    }
}
