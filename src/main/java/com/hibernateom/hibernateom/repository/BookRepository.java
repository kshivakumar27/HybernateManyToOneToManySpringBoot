package com.hibernateom.hibernateom.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernateom.hibernateom.enitity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
    public Book findByBookId(int bookId);

	public Book save(Book book);
}