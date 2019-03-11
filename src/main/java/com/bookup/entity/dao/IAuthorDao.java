package com.bookup.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.bookup.entity.models.Author;

public interface IAuthorDao extends CrudRepository<Author, Long>{

}
