package com.springcore.ci;

import org.springframework.context.ApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
        Person person = (Person) context.getBean("person");
        Person person1 = (Person) context.getBean("person1");
        Person person2 = (Person) context.getBean("person2");
        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);

        Addition addition = (Addition) context.getBean("add");
        addition.doSum();
    }
}
