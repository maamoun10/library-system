package com.example.data_jpa_book.repository;



import com.example.data_jpa_book.entity.Auther;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutherRepo extends JpaRepository<Auther, Long> {

}
