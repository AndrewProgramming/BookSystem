package com.andrew.booksystem.controller;

import com.andrew.booksystem.entity.Book;
import com.andrew.booksystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/createNewBook")
    public void createNewBook() {
        bookRepository.save(new Book("andrew", "andrew"));
    }
}
