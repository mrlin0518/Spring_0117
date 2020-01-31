package com.web.spring.study.aop2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class AudienceAspect {
    
//    @Before(value = "execution(* com.web.spring.study.aop2.Actor.show(..))")
//    public void befor(JoinPoint jo) throws Throwable{
//        System.out.println("觀眾入場");
//    }
//    
//    @Before(value="execution(* com.web.spring.study.aop2.Actor.show(..))")
//    public void befor2(JoinPoint jo) throws Throwable{
//        System.out.println("請關手機");
//    }
//    
//    @After(value="execution(* com.web.spring.study.aop2.Actor.show(..))")
//    public void after(JoinPoint jo) throws Throwable{
//        System.out.println("觀眾拍手(啪啪啪啪啪啪)");
//    }
    @Pointcut(value = "execution(* com.web.spring.study.aop2.Actor.show(..))")
    public void show() throws Throwable{}
    
    @Around(value = "show()")
    public void watchShow( ProceedingJoinPoint jp ) throws Throwable{
        try {
            System.out.println("觀眾入場");
            System.out.println("請關手機");
            jp.proceed();
            System.out.println("觀眾拍手(啪啪啪啪啪啪)");
        } catch (Exception e) {
             System.out.println("\u001B[31m太爛了 " + e.getMessage() + " ！退票");
        }
    }
}
