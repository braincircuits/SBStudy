package com.m20891.IOC;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class IOCC implements IOC{
    public IOCC() {
        System.out.println("IOCC初始化");
    }

    public void go() {
        System.out.println("IOCC的go方法");
    }
}
