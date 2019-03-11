package com.bookup.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookup.entity.dao.ICategoryDao;
import com.bookup.entity.models.Category;

@Service
public class CategoryService {
	
	@Autowired
	private ICategoryDao categoryDao;
	
	public List<Category> getAll(){
		return (List<Category>) categoryDao.findAll();
	}
	
	public void post(Category category) {
		categoryDao.save(category);
	}
}
