package com.m20891.AOP.autoproxy;

import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.util.ClassUtils;

import java.lang.reflect.Method;

public class MyPointcut extends StaticMethodMatcherPointcut {
    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        if ("com.m20891.controller.DController.get".equals(ClassUtils.getQualifiedMethodName(method))) {
            System.out.println("b000"+ClassUtils.getQualifiedMethodName(method));
            return true;
        }
        return false;
    }
}
