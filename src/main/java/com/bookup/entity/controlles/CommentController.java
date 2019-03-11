package com.bookup.entity.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookup.entity.models.Comment;
import com.bookup.entity.services.CommentService;

@RestController
public class CommentController {
	
	@Autowired
	CommentService commentServices;
	
	@GetMapping("/comment")
	public List<Comment> getAll(){
		return commentServices.getAll();
	}
	
	@PostMapping("/comment")
	public void add(Comment comment) {
		commentServices.post(comment);
	}
	
}
