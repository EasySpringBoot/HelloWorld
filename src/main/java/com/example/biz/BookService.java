package com.example.biz;

import java.util.List;

import com.example.domain.Book;

/**
 * Created by jack on 2017/4/5.
 */
public interface BookService {
    List<Book> findAll();
}
