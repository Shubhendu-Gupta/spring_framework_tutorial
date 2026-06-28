package com.springcore.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Dress {

    private double price;

    public Dress(double price) {
        this.price = price;
    }

    public Dress() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dress{" +
                "price=" + price +
                '}';
    }

    @PostConstruct
    public void start() {
        System.out.println("Dress bean is going through start.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Dress bean is going through destroy.");
    }
}
