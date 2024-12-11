package com.example.data_jpa_book.entity;

import jakarta.persistence.*;

@Entity
@Table(name="authers")
public class Auther {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String name ;


    public Auther() {
    }

    public Auther(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
