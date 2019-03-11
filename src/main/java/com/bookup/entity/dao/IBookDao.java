package com.bookup.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.bookup.entity.models.Book;

public interface IBookDao extends CrudRepository<Book, Long>{

}
