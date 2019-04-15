package com.andrew.booksystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/sayHello")
    public void sayHello() {
        System.out.printf("Hello!");
    }
}
