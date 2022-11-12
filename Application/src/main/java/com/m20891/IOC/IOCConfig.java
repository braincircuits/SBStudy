package com.m20891.IOC;

import org.springframework.beans.factory.annotation.CustomAutowireConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component
public class IOCConfig {
    @Bean
    public CustomAutowireConfigurer customAutowireConfigurer() {
        CustomAutowireConfigurer customAutowireConfigurer = new CustomAutowireConfigurer();
//        customAutowireConfigurer.setCustomQualifierTypes();
        return customAutowireConfigurer;
    }
}
