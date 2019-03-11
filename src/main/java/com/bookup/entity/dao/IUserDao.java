package com.bookup.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.bookup.entity.models.Users;

public interface IUserDao extends CrudRepository<Users, Long>{

}
