package com.company;

public class Invoice {
    private int ID;
    private Customer customer;
    private double amount;

    public Invoice(int ID, Customer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmountAfterDiscount(){
        return amount - customer.setDiscount();
    }


    public void printAll(){
        System.out.println("The Customer Name Is: "+ this.getCustomer()  +"\n"+" The Total Amount before  Discount = "
                + this.getAmount()  +"\n"+" The Total Amount After " + customer.getDiscount() + "% Discount = "+ getAmountAfterDiscount() );
    }



}
