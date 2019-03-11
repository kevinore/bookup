package com.bookup.entity.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookup.entity.models.Block;
import com.bookup.entity.services.BlockService;

@RestController
public class BlockController {
	
	@Autowired
	BlockService blockService;
	
	@GetMapping("/block")
	public List<Block> getAll(){
		return blockService.getAll();
	}
	
	@PostMapping("/block")
	public void add(Block block) {
		blockService.post(block);
	}
}
