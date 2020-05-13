package com.dz.lbs.service;

import com.dz.lbs.model.Book;

import java.util.Optional;


public interface LbsService {

    Optional<Book> getbookByID(long id );

    Book saveBook(Book book);

}
