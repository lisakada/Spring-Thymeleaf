package com.example.thymeleafapp;

import com.example.thymeleafapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private BookService bookService;

    @GetMapping()
    public String home() {
        return "index";
    }
}
