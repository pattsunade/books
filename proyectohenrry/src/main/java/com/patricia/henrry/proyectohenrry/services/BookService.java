package com.patricia.henrry.proyectohenrry.services;

import java.util.List;
import java.util.Optional;

import com.patricia.henrry.proyectohenrry.models.Book;
import com.patricia.henrry.proyectohenrry.repositories.BookRepository;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepository bookRepository;
     public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
    
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
     //Devolviendo todos los libros.
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    //Creando un libro.
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    //Obteniendo la información de un libro
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }

    
}
