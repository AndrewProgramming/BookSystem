package com.andrew.booksystem.controller;

import com.andrew.booksystem.entity.Book;
import com.andrew.booksystem.repository.BookRepository;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import org.apache.logging.log4j.Logger;

@RestController
public class BookController {
    private static final Logger LOGGER = LogManager.getLogger(BookController.class);

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/createNewBook")
    public void createNewBook() {
        bookRepository.save(new Book("andrew", "andrew"));
    }

    @GetMapping("/findBookByName/{bookName}")
    public void findBookByName(@PathVariable String bookName) {
        Book book = bookRepository.findBookByName(bookName);

        LOGGER.info("book id is:" + book.getId());
        LOGGER.info("book name is:" + book.getName());
        LOGGER.info("book author is:" + book.getAuthor());


    }
}
