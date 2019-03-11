package com.bookup.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookup.entity.dao.IBook_author;
import com.bookup.entity.models.Book_author;

@Service
public class Book_authorService {
	
	@Autowired
	private IBook_author book_authorDao;
	
	public List<Book_author> getAll(){
		return (List<Book_author>) book_authorDao.findAll();
	}
	
	public void post(Book_author book_author) {
		book_authorDao.save(book_author);
	}
}
