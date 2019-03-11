package com.bookup.entity.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookup.entity.models.Loan;
import com.bookup.entity.services.LoanService;

@RestController
public class LoanController {
	
	@Autowired
	LoanService loanService;
	
	@GetMapping("/loan")
	public List<Loan> getAll(){
		return loanService.getAll();
	}
	
	@PostMapping("/loan")
	public void add(Loan loan) {
		loanService.post(loan);
	}
}
