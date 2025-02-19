package com.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContex=new AnnotationConfigApplicationContext(Baseconfig.class);
        Shoppingcart shoppingcart=applicationContex.getBean(Shoppingcart.class);
        shoppingcart.checkoutlist("CANCELLED");
    }
}