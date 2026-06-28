package com.springcore.lifecycle;

public class Book {

    private double price;

    public Book(double price) {
        this.price = price;
    }

    public Book() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                '}';
    }

    public void hey() {
        System.out.println("Inside init method: how are you?");
    }

    public void bye() {
        System.out.println("Inside destroy method: bye bye I am going to die");
    }
}
