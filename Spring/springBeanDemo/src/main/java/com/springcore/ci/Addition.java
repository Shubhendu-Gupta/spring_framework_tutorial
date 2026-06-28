package com.springcore.ci;

public class Addition {

    private int a;
    private int b;

    private Addition(double a, double b) {
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("Private constructor with double parameters called.");
    }

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Public constructor with int parameters called.");
    }

    private Addition(String a, String b) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("Private constructor with String parameters called.");
    }

    public void doSum() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("Sum is: " + (a + b));
    }
}
