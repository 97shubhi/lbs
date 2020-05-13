package com.dz.lbs.controller;

import com.dz.lbs.model.Book;
import com.dz.lbs.service.LbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class LbsController {

    @Autowired
    LbsService lbsService;

    @RequestMapping("/getID")
    public Optional<Book> getBookById(@RequestParam("id") long id){

        return lbsService.getbookByID (id);

    }

    @RequestMapping("/saveBook")
    public Book getBookById(Book book){

        return lbsService.saveBook (book);

    }

}
