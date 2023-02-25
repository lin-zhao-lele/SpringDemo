package com.example.springdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lmh
 * @version 1.0
 * @description: index controller
 */
@RestController
@RequestMapping("/hello")
public class HelloWorld {
    @RequestMapping("/helloworld")
    public String helloWorld(){
        return "Hello World!!!!";
    }
}