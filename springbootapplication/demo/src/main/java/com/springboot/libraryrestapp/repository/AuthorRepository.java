package com.springboot.libraryrestapp.repository;

import com.springboot.libraryrestapp.model.Author;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author , Integer> {
    
}