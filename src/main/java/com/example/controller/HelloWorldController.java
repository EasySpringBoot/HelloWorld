package com.example.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jack on 2017/4/4.
 */
@RestController
public class HelloWorldController {
    @RequestMapping("hello")
    String hello() {
        return "Hello World! " + new Date();
    }
}
