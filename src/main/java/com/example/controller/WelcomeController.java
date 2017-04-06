package com.example.controller;

import java.util.Date;
import java.util.Map;

import com.example.biz.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by jack on 2017/4/5.
 */
@Controller
public class WelcomeController {

    @Value("${application.message:Hello,World}")
    private String message = "Hello,World";

    @Autowired
    BookService bookService;

    @GetMapping("/welcome")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        model.put("books", bookService.findAll());
        return "welcome";
    }

}
