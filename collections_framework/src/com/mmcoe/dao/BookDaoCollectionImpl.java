package com.mmcoe.dao;

import java.util.List;
import java.util.Vector;

import com.mmcoe.pojo.Book;

public class BookDaoCollectionImpl implements BookDao {
	private List<Book> books;
	
	public BookDaoCollectionImpl() {
		books = new Vector<Books>();
	}

	@Override
	public boolean save(Book b) {
		books.add(b);
		return true;
	}

	@Override
	public Book find(int isbn) {
		
		
		return null;
	}

	@Override
	public List<Book> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int isbn) {
		// TODO Auto-generated method stub
		return false;
	}

}
