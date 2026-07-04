package com.mmcoe.service;

import com.mmcoe.pojo.*;
import com.mmcoe.dao.BookDao;
import com.mmcoe.dao.BookDaoCollectionImpl;

public class TestBookService {
	public static void main(String[] args) {
		BookDao dao =new BookDaoCollectionImpl();
		BookService service=new BookServiceImpl(dao);
		
		service.save(new Book(11,"The Alchemist", "Paulo Coelho", 250));
		service.save(new Book(12,"Metamorphisis", "Frank Kafka", 210));
		service.save(new Book(13,"C Programing", "Zubair Shaikh", 150));
		
		for(Book b:service.list())
			System.out.println(b);
		
		try {
			System.out.println(service.find(12));
		}catch (BooksNotFoundException e) {
			e.printStackTrace();
		}
		
		for(Book b:service.findByPrice(200, 300))
			System.out.println(b);
		try {
			service.delete(15);
		}catch (BooksNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}