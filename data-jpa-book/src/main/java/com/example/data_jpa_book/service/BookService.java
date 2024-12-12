package com.example.data_jpa_book.service;


import com.example.data_jpa_book.entity.Auther;
import com.example.data_jpa_book.entity.Book;
import com.example.data_jpa_book.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepo bookRepo;


    public Book findById(Long id){

        return bookRepo.findById(id).orElseThrow();
    };

    public List<Book> findAll(){
        return bookRepo.findAll();

    };

    public Book insert(Book book){

        return bookRepo.save(book);
    };

    public List<Book> insert(List<Book> book){

        return bookRepo.saveAll(book);
    };


    public Book update(Book entity){
        Book book=findById(entity.getId());
        book.setName(book.getName());
        return bookRepo.save(book);

    };

    public void deleteById(Long id ){
        bookRepo.deleteById(id);

    };




}

