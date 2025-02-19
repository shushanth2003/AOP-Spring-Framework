package com.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Authenicationrequest {
    @Pointcut("within(com.demo..*)")
    public void authenicationrequest(){

    }
    @Pointcut("within(com.demo..*)")
    public void authorizationrequest(){

    }

    @Before("authenicationrequest() && authorizationrequest()")
    public void verificationrequest(){
        System.out.println("REQUESTING THE AUTHENICATION");
    }
}
