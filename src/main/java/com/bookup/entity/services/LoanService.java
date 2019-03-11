package com.bookup.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookup.entity.dao.ILoanDao;
import com.bookup.entity.models.Loan;

@Service
public class LoanService {
	
	@Autowired
	private ILoanDao loanDao;
	
	public List<Loan> getAll(){
		return (List<Loan>) loanDao.findAll();
	}
	
	public void post(Loan loan) {
		loanDao.save(loan);
	}
}
