package com.m20891.AOP.Annotation;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(999)
public class AnnotationAOPConfig {
    @Pointcut("execution(* *..*.get(..))")
    public void a(){}
    @Around("a()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("注解 AOP开始");
        Object proceed = joinPoint.proceed();
        System.out.println("注解AOP结束");
        return proceed;
    }
}
