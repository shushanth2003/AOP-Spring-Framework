package com.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Loggers {
    @Before("execution(* com.demo.Shoppingcart.checkoutlist(..))")
    public void beforelogging(JoinPoint jr){
        System.out.println(jr.getSignature());
        String args=jr.getArgs()[0].toString();
        System.out.println(args);
        System.out.println("Please Logging the form");
    }

    @After("execution(* *.*.*.checkoutlist(..))")
    public void afterlogging(){
        System.out.println("Signing the page");
    }
}
