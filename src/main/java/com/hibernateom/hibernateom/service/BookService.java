package com.hibernateom.hibernateom.service;


import org.springframework.stereotype.Component;

import com.hibernateom.hibernateom.enitity.Book;

@Component
public interface BookService {
    public Book saveBook(Book book);
    public Book findByBookId(int bookId);
}