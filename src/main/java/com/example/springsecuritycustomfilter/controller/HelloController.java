package com.example.springsecuritycustomfilter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/get/request")
    public String hell(){
        return "Secured Get Request";
    }
}
