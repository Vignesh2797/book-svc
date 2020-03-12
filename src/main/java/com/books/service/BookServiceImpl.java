package com.books.service;

import com.books.model.BookDetails;
import com.books.model.LoginDetails;
import com.books.model.UserDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@Service
public class BookServiceImpl implements BookService {

    ArrayList<UserDetails> inMemoryDataBaseUser=new ArrayList<>();
    ArrayList<BookDetails> inMemoryDataBaseBooks=new ArrayList<>();

    @Override
    public void addUser(UserDetails userDetails) {

        inMemoryDataBaseUser.add(userDetails);

    }

    @Override
    public boolean login(LoginDetails loginDetails) {
        AtomicBoolean isValid= new AtomicBoolean(false);
        inMemoryDataBaseUser.forEach(x->{
            if(x.getUserName().equals(loginDetails.getUserName()) && x.getPassword().equals(loginDetails.getPassword()))
                isValid.set(true);
        });

        return isValid.get();
    }

    @Override
    public void addBook(BookDetails bookDetails) {

        inMemoryDataBaseBooks.add(bookDetails);

    }

    @Override
    public ArrayList<BookDetails>  getBooks() {

        return inMemoryDataBaseBooks;

    }
}
