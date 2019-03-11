package com.bookup.entity.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookup.entity.models.Book_author;
import com.bookup.entity.services.Book_authorService;

@RestController
public class Book_authorController {
	
	@Autowired
	Book_authorService book_authorService;
	
	@GetMapping("/book_author")
	public List<Book_author> getAll(){
		return book_authorService.getAll();
	}
	
	@PostMapping("/book_author")
	public void add(Book_author book_author) {
		book_authorService.post(book_author);
	}
}
