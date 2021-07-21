package com.patricia.henrry.proyectohenrry.repositories;

import java.util.List;

import com.patricia.henrry.proyectohenrry.models.Book;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository 
public interface BookRepository extends CrudRepository<Book, Long> {
    
    List<Book> findAll();

    

}
