package com.example.thymeleafapp;

import com.example.thymeleafapp.model.Book;

import com.example.thymeleafapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/book")
    public String showForm(Model model) {
        Book book = new Book();
        model.addAttribute("book", book);
        //model.addAttribute("activePage", "register"); // Highlights the item in the nav bar.
        return "book";
    }

    @PostMapping("/book")
    public String formPosted(@ModelAttribute("book") Book book) {
        System.out.printf(book.getIsbn());
        System.out.println(book.getPrice());
        System.out.println(book.getTitle());
        bookService.insertBook(book);
        return "book_success";
    }

}


//    @PostMapping("bookApp")
//    public Book insertBook(@RequestBody Book book){
//        bookService.insertBook(book);
//        return book;
//    }
//}

    // PostMapping()  // Form post spring mvc
    // public void addBook() {
    //   bookService.addBook(model)...
    //}



//    @Controller
//    public class BookController {
//        @RequestMapping(value = "/student", method = RequestMethod.GET)
//        public ModelAndView student() {
//            return new ModelAndView("student", "command", new Book());
//        }
//        @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
//        public String addStudent(@ModelAttribute("SpringWeb")Book book, ModelMap model) {
//            model.addAttribute("Id", book.getId());
//            model.addAttribute("Title", book.getTitle());
//            model.addAttribute("Isbn", book.getIsbn());
//            model.addAttribute("Price", book.getPrice());
//            return "result";
//        }
//    }

