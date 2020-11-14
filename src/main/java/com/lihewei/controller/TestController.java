package com.lihewei.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author apple
 */
@RestController
public class TestController {


    @GetMapping("/say")
    public String say(){
        return "hello";
    }
}
