package com.dz.lbs.service.impl;

import com.dz.lbs.dao.LbsDao;
import com.dz.lbs.model.Book;
import com.dz.lbs.service.LbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LbsServiceImpl implements LbsService {

    @Autowired
    private LbsDao lbsDao;

    @Override
    public Optional<Book> getbookByID(long id) {

        return lbsDao.findById (id);

    }

    @Override
    public Book saveBook(Book book) {
        return lbsDao.save(book);
    }
}
