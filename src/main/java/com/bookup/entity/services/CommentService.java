package com.bookup.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookup.entity.dao.ICommentDao;
import com.bookup.entity.models.Comment;


@Service
public class CommentService {
	
	@Autowired 
	private ICommentDao commentDao;
	
	public List<Comment> getAll(){
		return (List<Comment>) commentDao.findAll();
	}
	
	public void post(Comment comment) {
		commentDao.save(comment);
	}
}
