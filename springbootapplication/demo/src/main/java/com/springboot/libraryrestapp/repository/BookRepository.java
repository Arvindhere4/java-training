package com.springboot.libraryrestapp.repository;

import com.springboot.libraryrestapp.model.Author;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Author , Integer> {
    
}