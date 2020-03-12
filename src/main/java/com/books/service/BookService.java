package com.books.service;

import com.books.model.BookDetails;
import com.books.model.LoginDetails;
import com.books.model.UserDetails;

import java.util.ArrayList;

public interface BookService {

    void addUser(UserDetails userDetails);
    boolean login(LoginDetails loginDetails);
    void addBook(BookDetails bookDetails);
     ArrayList<BookDetails> getBooks();

}
