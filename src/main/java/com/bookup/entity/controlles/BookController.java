package com.bookup.entity.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookup.entity.models.Book;
import com.bookup.entity.services.BookServices;

@RestController
public class BookController {
	
	@Autowired
	BookServices bookServices;
	
	@GetMapping("/book")
	public List<Book> getAll(){
		return bookServices.getAll();
	}
	
	@PostMapping("/book")
	public void add(Book book) {
		bookServices.post(book);
	}
}
