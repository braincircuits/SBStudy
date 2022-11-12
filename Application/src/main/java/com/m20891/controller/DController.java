package com.m20891.controller;

import com.m20891.IOC.IOCC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DController {
    @Autowired
    private IOCC iocc;
    public DController() {
        System.out.println("初始化");
    }

    @GetMapping("get")
    @Transactional
    public String get() {
        System.out.println("目标方法执行");
        return "OK";
    }
}
