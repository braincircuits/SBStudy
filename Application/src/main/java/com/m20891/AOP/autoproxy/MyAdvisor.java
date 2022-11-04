package com.m20891.AOP.autoproxy;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractBeanFactoryPointcutAdvisor;

public class MyAdvisor extends AbstractBeanFactoryPointcutAdvisor {
    private MyPointcut myPointcut=new MyPointcut();
    @Override
    public Pointcut getPointcut() {
        return myPointcut;
    }

    @Override
    public void setAdvice(Advice advice) {
        super.setAdvice(advice);
    }

}
