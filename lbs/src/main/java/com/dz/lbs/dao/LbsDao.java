package com.dz.lbs.dao;


import com.dz.lbs.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface LbsDao extends CrudRepository<Book, Long> {

}
