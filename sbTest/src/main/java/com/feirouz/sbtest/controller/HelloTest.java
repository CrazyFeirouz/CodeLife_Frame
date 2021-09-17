package com.feirouz.sbtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 配合vue的测试使用
 * @author: Feirouz
 * @date: 2021-09-12 22:25
 */

@RestController
public class HelloTest {
    @RequestMapping(value= "/index")
    public String hello(){
        return "Welcome~";
    }
}