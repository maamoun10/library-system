package com.example.data_jpa_book.service;

import com.example.data_jpa_book.entity.Auther;
import com.example.data_jpa_book.repository.AutherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutherService {

    @Autowired
    private AutherRepo autherRepo;

    public Auther findById(Long id){

        return autherRepo.findById(id).orElseThrow();
    };


    public List<Auther> findAll(){
        return autherRepo.findAll();

    };

    public Auther insert(Auther auther){
        return autherRepo.save(auther);
    };


    public Auther update(Auther entity){

        Auther auther=findById(entity.getId());

        auther.setName(auther.getName());

        return autherRepo.save(auther);

    };










}
