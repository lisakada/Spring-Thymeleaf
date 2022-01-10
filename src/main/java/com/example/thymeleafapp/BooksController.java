package com.example.thymeleafapp;

import com.example.thymeleafapp.model.Book;
import com.example.thymeleafapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BooksController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String getBook(Model model, String keyword) {
        if (keyword != null) {
            model.addAttribute("books", bookService.findByKeyword(keyword));
        } else {
            model.addAttribute("books", bookService.findAllBooks());
        }
            return "books";
    }
}
