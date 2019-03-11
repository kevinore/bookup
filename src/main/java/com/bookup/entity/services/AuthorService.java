package com.bookup.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookup.entity.dao.IAuthorDao;
import com.bookup.entity.models.Author;

@Service 
public class AuthorService {
	
	@Autowired
	private IAuthorDao authorDao;
	
	public List<Author> getAll(){
		return (List<Author>) authorDao.findAll();
	}
	
	public void post(Author author) {
		authorDao.save(author);
	}
}
