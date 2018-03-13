package com.boot;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.io.IOException;


//Q1) Create a logging aspect. Create a pointcut to log all methods Of services .
@Component
@Aspect
public class AopLoginAspect {


    //Q2) Add a logging statement before and after the method ends
    @Before("execution(* com.boot.Service_1.*(..))")
    public void beforelog(JoinPoint joinPoint){

        // Q)7Access the properties of the JoinPoint in before advice. Print Signature of method being called and its arguments

        System.out.println(joinPoint.getSignature());
        System.out.println(joinPoint.getArgs());

        System.out.println("Before Service_1");
    }



//   Q6)  Demonstrate the use of pointCut @Pointcut annotation and Reuse the expression created

//  @Pointcut("execution(* com.demo.UserService.*(..))")
//    public void logAfter(){
//        System.out.println("===Log After===");
//    }


//Q5) Apply execution, within, args, this and bean expressions on the before and after advice of service bean.

    //   @Before("this(com.demo.UserService)")
    @Before("execution(* com.boot.Service_2.*(..))")
    public void beforelog1(){
        System.out.println("Before Service_2");
    }

//    @After("execution(* com.boot.Service_1.*(..))")
//    public void afterlog(){
//        System.out.println("After Service_1");
//    }

    @After("within(com.boot.Service_1)")
    public void afterlog(){
        System.out.println("After Service_1");
    }


    @After("within(com.boot.Service_1)")
    public void after(){
        System.out.println("After Service_1");
    }





    @After("execution(* com.boot.Service_2.*(..))")
    public void afterlog1(){
        System.out.println("After Service_2");
    }


    //Q3) Log all the methods which throw IOException
    @AfterThrowing(value = "execution(* com.boot.*.*(..))",throwing = "e")
    public void logAfterThrowing(Exception e)throws Throwable{
        if(e instanceof IOException)
        System.out.println("Error is"+e);
    }


    //Q4)  Log all the methods annotated with @Deprecated Annotation
//    @Before( "@annotation=deprecated")
//    public void deprecated(){
//        System.out.println("Its deprecated");
//    }




}
