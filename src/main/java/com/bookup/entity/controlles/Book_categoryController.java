package com.bookup.entity.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookup.entity.models.Book_category;
import com.bookup.entity.services.Book_categoryServices;

@RestController
public class Book_categoryController {
	
	@Autowired
	Book_categoryServices book_categoryService;
	
	@GetMapping("/book_category")
	public List<Book_category> getAll(){
		return book_categoryService.getAll();
	}
	
	@PostMapping("/book_category")
	public void add(Book_category book_category) {
		book_categoryService.post(book_category);
	}
	
}
