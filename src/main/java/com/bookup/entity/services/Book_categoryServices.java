package com.bookup.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookup.entity.dao.IBook_categoryDao;
import com.bookup.entity.models.Book_category;

@Service
public class Book_categoryServices {
	
	@Autowired
	private IBook_categoryDao book_categoryDao;
	
	public List<Book_category> getAll(){
		return (List<Book_category>) book_categoryDao.findAll();
	}
	
	public void post(Book_category book_category) {
		book_categoryDao.save(book_category);
	}
}
