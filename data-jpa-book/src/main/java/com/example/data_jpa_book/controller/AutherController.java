package com.example.data_jpa_book.controller;

import com.example.data_jpa_book.service.AutherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auther")
public class AutherController {

    @Autowired
    AutherService autherService;
}
