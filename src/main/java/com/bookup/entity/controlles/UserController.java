package com.bookup.entity.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookup.entity.models.Users;
import com.bookup.entity.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/user")
	public List<Users> getAll(){
		return userService.getAll();
	}
	
	@PostMapping("/user")
	public void add(Users user) {
		userService.post(user);
	}
	
}
