package com.bookup.entity.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookup.entity.models.Category;
import com.bookup.entity.services.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/category")
	public List<Category> getAll(){
		return categoryService.getAll();
	}
	
	@PostMapping("/category")
	public void add(Category category) {
		categoryService.post(category);
	}
}
