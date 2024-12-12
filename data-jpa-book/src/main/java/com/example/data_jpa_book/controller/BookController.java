package com.example.data_jpa_book.controller;


import com.example.data_jpa_book.entity.Auther;
import com.example.data_jpa_book.entity.Book;
import com.example.data_jpa_book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;


    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){

        return ResponseEntity.ok(bookService.findById(id));
    };
    @GetMapping()
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok( bookService.findAll());
    };
    @PostMapping()
    public ResponseEntity<?> insert(@RequestBody Book book){
        return ResponseEntity.ok(bookService.insert(book));
    };

    @PutMapping()
    public ResponseEntity<?> update(@RequestBody Book book){
        return ResponseEntity.ok(bookService.update(book));
    };

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id ){
        bookService.deleteById(id);
        return ResponseEntity.ok(null);
    };



}
