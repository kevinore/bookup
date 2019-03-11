package com.bookup.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookup.entity.dao.IBlockDao;
import com.bookup.entity.models.Block;

@Service
public class BlockService {
	
	@Autowired
	private IBlockDao blockDao;
	
	public List<Block> getAll(){
		return (List<Block>) blockDao.findAll();
	}
	
	public void post(Block block) {
		blockDao.save(block);
	}
}
