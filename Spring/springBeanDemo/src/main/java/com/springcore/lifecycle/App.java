package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main(String[] args) {
        AbstractApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
        Book book = (Book) context.getBean("book");
        System.out.println(book);
        // Closing the context to trigger the destroy method of the bean
        context.registerShutdownHook();

        System.out.println("------------------------------------------------");
        Bag bag = (Bag) context.getBean("bag");
        System.out.println(bag);

        System.out.println("------------------------------------------------");
        Dress dress = (Dress) context.getBean("dress");
        System.out.println(dress);
        context.close();
    }

}
