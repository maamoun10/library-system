package com.example.data_jpa_book.service;


import com.example.data_jpa_book.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepo bookRepo;

}

