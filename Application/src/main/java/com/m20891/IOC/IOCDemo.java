package com.m20891.IOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Provider;

@Configuration
public class IOCDemo {
    public IOCDemo(@Value("${DataA}") String s) {
        System.out.println("@value注入"+s);
    }

    private IOC ioc;
    @Autowired
    public void setIOCA(IOC IOCA) {
        System.out.println("@Autowired可以根据名字注入");
        this.ioc=IOCA;
    }



    private IOC IOCB;
    @Inject
    public void setIOCB(IOC IOCB) {
        System.out.println("@Inject 注入");
    }

    private Provider<IOC> IOCC;

    @Autowired
    public void setIOCC(Provider<IOC> IOCC) {
        System.out.println("通过Provider获取Bean");
        this.IOCC=IOCC;
    }

    @PostConstruct
    public void post() {
        System.out.println("通过Provider和@Lazy延迟获取Bean");
        System.out.println(IOCC.get());
    }
}
