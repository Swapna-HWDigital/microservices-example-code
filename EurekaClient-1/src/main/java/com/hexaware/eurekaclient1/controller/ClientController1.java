package com.hexaware.eurekaclient1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController1 {
 
    @GetMapping("/client1")
    public String client1() {
        return "I am client 1";
    }
 
}
