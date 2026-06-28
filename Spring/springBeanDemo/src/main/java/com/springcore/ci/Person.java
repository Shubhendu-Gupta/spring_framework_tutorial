package com.springcore.ci;

public class Person {
    String name;
    int age;
    Certificate certificate;

    public Person(String name, int age, Certificate certificate) {
        this.age = age;
        this.name = name;
        this.certificate = certificate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", certificate=" + certificate.name +
                '}';
    }
}
