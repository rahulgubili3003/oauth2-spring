package com.demo.oauth2spring.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/oauth2")
public class Oauth2Controller {

    @GetMapping("/noAuth")
    public String noAuth() {
        return "Hello, No Authentication";
    }

    @GetMapping("/withAuth")
    public String withAuth() {
        return "Hello, With Authentication";
    }
}
