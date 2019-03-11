package com.bookup.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.bookup.entity.models.Block;

public interface IBlockDao extends CrudRepository<Block, Long>{

}
