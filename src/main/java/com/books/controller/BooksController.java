package com.books.controller;

import com.books.model.BookDetails;
import com.books.model.LoginDetails;
import com.books.model.UserDetails;
import com.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BooksController {

    private final static String SIGN_UP="/signup";
    private final static String LOGIN="/login";
    private final static String ADD_BOOK="/addbook";
    private final static String GET_BOOKS="/getbooks";

    @Autowired
    private BookService bookService;

    @PostMapping(SIGN_UP)
    private void signUp(UserDetails userDetails){
        bookService.addUser(userDetails);
    }

    @PostMapping(LOGIN)
    private boolean login(LoginDetails loginDetails){
        return bookService.login(loginDetails);
    }

    @PostMapping(ADD_BOOK)
    private void  addBook(BookDetails bookDetails){  bookService.addBook(bookDetails);}

    @GetMapping(GET_BOOKS)
    private ArrayList<BookDetails> getBooks(){return  bookService.getBooks();};



}
