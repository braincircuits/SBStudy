package com.m20891.AOP.autoproxy;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Role;
import org.springframework.stereotype.Component;

@Component
public class AutoAOPConfig {
    @Bean(name = "abc00")
    @Role(BeanDefinition.ROLE_INFRASTRUCTURE)
    public MyAdvisor advisor(MyMethodInterceptor interceptor) {
        MyAdvisor myAdvisor = new MyAdvisor();
        myAdvisor.setAdvice(interceptor);
        myAdvisor.setOrder(1001);
        return myAdvisor;
    }
}
