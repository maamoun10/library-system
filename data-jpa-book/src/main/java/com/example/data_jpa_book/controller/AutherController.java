package com.example.data_jpa_book.controller;

import com.example.data_jpa_book.entity.Auther;
import com.example.data_jpa_book.service.AutherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auther")
public class AutherController {

 @Autowired
 AutherService autherService;


@GetMapping("/{id}")
public ResponseEntity<?> findById(@PathVariable Long id){

   return ResponseEntity.ok(autherService.findById(id));
};
@GetMapping()
public ResponseEntity<?> findAll(){
    return ResponseEntity.ok( autherService.findAll());
    };
@PostMapping()
public ResponseEntity<?> insert(@RequestBody Auther auther){
    return ResponseEntity.ok(autherService.insert(auther));
    };

@PutMapping()
public ResponseEntity<?> update(@RequestBody Auther entity){
        return ResponseEntity.ok(autherService.update(entity));
    };

@DeleteMapping
public ResponseEntity<?> deleteById(@PathVariable Long id ){

   autherService.deleteById(id);
   return ResponseEntity.ok(null);
};




}
