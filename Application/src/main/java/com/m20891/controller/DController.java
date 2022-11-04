package com.m20891.controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DController {
    @GetMapping("get")
    @Transactional
    public String get() {
        return "OK";
    }
}
