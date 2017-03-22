package com.cc.library.service;

import java.util.List;

import com.cc.library.domain.Book;
import com.cc.library.domain.BookType;
import com.cc.library.domain.PageBean;

public interface BookService {

	public List<BookType> getAllBookTypes();

	public PageBean<BookType> findBookByPage(int pageCode, int pageSize);

	public boolean addBook(Book book);

	public BookType getBookType(BookType bookType);

	public Book getBookById(Book book);

	public Book updateBookInfo(Book updateBook);


}
