package com.bookup.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.bookup.entity.models.Comment;

public interface ICommentDao extends CrudRepository<Comment, Long>{

}
