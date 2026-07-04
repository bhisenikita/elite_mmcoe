package com.mmcoe.service;

import java.util.List;

import com.mmcoe.pojo.Book;

public interface BookService {
    
	boolean save(Book b);
	
	Book find(int isbn) throws BooksNotFoundException;
	
	List<Book> list();
	
	boolean delete(int isbn) throws BooksNotFoundException;
	
	List<Book> findByPrice(double min, double max);

}
