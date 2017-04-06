package com.example.biz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.domain.Book;
import org.springframework.stereotype.Service;

/**
 * Created by jack on 2017/4/5.
 */
@Service
public class BookServiceImpl implements BookService{
    @Override
    public List<Book> findAll() {
        List<Book> bookList = new ArrayList<>();
        Book book = new Book();
        book.setAuthor("Jason Chen");
        book.setName("极简SpringBoot教程");
        book.setPress("电子工业出版社");
        book.setGmtCreated(new Date());
        book.setGmtModified(new Date());
        bookList.add(book);
        return bookList;
    }
}
