package com.tia.chatty.api.novel.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1")
public class TestController {

    @GetMapping(value="/get-test-api")
    public String testApi(){
        return "Hello World";
    }
}
