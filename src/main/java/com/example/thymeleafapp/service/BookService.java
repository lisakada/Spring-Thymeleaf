package com.example.thymeleafapp.service;

import com.example.thymeleafapp.model.Book;
import com.example.thymeleafapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public void insertBook(Book book) {
        bookRepository.save(book);
    }

    public List<Book> findAllBooks(){
        return (List<Book>) bookRepository.findAll();
    }

    public List<Book> findByKeyword(String keyword){
        return (List<Book>) bookRepository.findByKeyword(keyword);
    }

}











//    public BookService(){}
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//    @Autowired
//    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//
//    private final String INSERT_BOOK = "insert into book (title, isbn, price) values (:title, :isbn, :price)";
//
//    public Book insertBook( @RequestBody Book book) {
//        final KeyHolder keyId = new GeneratedKeyHolder();
//        SqlParameterSource namedParameters = new MapSqlParameterSource("BookId",book.getId())
//                .addValue("title", book.getTitle())
//                .addValue("isbn", book.getIsbn())
//                .addValue("price", book.getPrice());
//        namedParameterJdbcTemplate.update(INSERT_BOOK, namedParameters, keyId);
//        return book;
//    }

//}
