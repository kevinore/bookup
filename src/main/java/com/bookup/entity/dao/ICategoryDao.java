package com.bookup.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.bookup.entity.models.Category;

public interface ICategoryDao extends CrudRepository<Category, Long>{
	
}
