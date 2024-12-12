package com.example.data_jpa_book.config;

import com.example.data_jpa_book.entity.Auther;
import com.example.data_jpa_book.entity.Book;
import com.example.data_jpa_book.service.AutherService;
import com.example.data_jpa_book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Arrays;


@Component
public class StarterApp implements CommandLineRunner {
    @Autowired
    AutherService autherService;
    @Autowired
    BookService bookService;

    @Override
    public void run(String... args) throws Exception {

        while (bookService.findAll().isEmpty()) {
            //Adding some authers
            Auther auther1 = new Auther();
            auther1.setName("leo");

            Auther auther2 = new Auther();
            auther2.setName("nay");

            Auther auther3 = new Auther();
            auther3.setName("yam");
            autherService.insert(Arrays.asList(auther1, auther2, auther3));

            // Adding some books
            Book book1 = new Book();
            book1.setName("magic");
            book1.setPrice(175);
            book1.setAuther(autherService.findById(7l));

            Book book2 = new Book();
            book2.setName("free");
            book2.setPrice(130);
            book2.setAuther(autherService.findById(8l));

            Book book3 = new Book();
            book3.setName("out");
            book3.setPrice(110);
            book3.setAuther(autherService.findById(9l));

            bookService.insert(Arrays.asList(book1, book2, book3));


        }
    }
}