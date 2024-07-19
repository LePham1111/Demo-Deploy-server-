package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

@RestController
public class PaymentController {

    @GetMapping(value = "/hello")
    String getPay() throws UnsupportedEncodingException {
        return "Hello";
    }
}
