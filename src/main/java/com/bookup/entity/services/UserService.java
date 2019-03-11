package com.bookup.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookup.entity.dao.IUserDao;
import com.bookup.entity.models.Users;

@Service
public class UserService {
	
	@Autowired
	private IUserDao userDao;
	
	public List<Users> getAll(){
		return (List<Users>) userDao.findAll();
	}
	
	public void post(Users users) {
		userDao.save(users);
	}
}
