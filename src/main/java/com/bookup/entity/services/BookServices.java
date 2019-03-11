package com.bookup.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookup.entity.dao.IBookDao;
import com.bookup.entity.models.Book;

@Service
public class BookServices {
	
	@Autowired
	private IBookDao bookDao;
	
	public List<Book> getAll(){
		return(List<Book>) bookDao.findAll();
	}
	
	public void post(Book book) {
		bookDao.save(book);
	}
}
