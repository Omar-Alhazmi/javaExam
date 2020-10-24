package com.company;

public class Customer {
    private int ID ;
    private String name;
    private int discount;

    public Customer(int ID, String name, int discount) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }
    public String toString() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount ;
    }
public double setDiscount(){
       return  100 * this.discount / 100;
    }
}



