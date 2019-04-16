package com.andrew.booksystem.repository;

import com.andrew.booksystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends JpaRepository<Book, Long> {

    Book findByName(String name);

    @Query(value = "select * from book where book.name=?1", nativeQuery = true)
    Book findBookByName(String name);


}
