package com.bookup.entity.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookup.entity.models.Author;
import com.bookup.entity.services.AuthorService;

@RestController
public class AuthorController {
	
	@Autowired
	AuthorService authorService;
	
	@GetMapping("/author")
	public List<Author> getAll(){
		return authorService.getAll();
	}
	
	@PostMapping("/author")
	public void add(Author author) {
		authorService.post(author);
	}
}
