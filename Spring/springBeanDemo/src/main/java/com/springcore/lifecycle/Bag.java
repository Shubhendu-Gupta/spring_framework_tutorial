package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bag implements InitializingBean, DisposableBean {
    private double price;

    public Bag(double price) {
        this.price = price;
    }

    public Bag() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean: afterPropertiesSet() method called for Bag");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean: destroy() method called for Bag");
    }
}
