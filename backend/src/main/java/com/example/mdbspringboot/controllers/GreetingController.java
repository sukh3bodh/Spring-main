package com.example.mdbspringboot.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

class testUser {
    public String name;
    public Integer balance;
}

@RestController
public class GreetingController {
    @GetMapping("/hello")
    String hello() {
        return "Hello World";
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/user")
    testUser getUser() {
        testUser u = new testUser();
        u.name = "Granth";
        u.balance = 69;
        return u;
    }

}
